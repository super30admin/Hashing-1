// Time complexity: O(nk) as O(nk) + O(n) = O(nk) where k is avg length of string and n is number of strings
//Space complexity: OO(nk) as (nk) + O(26) = o(nk) as we are storing each char

/* Approach:
    Use prime factor hashing. Get the prime factor of each char in the string and multiply it. For anagrams the prime factor will be same.
    Keep adding the prime products as keys in hashmap and the corresponding string in the values array.
    At the end, return a array of all the values in that hashmap.

*/

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if (strs == null || strs.length == 0) return result;
        HashMap<Double, List<String>> map = new HashMap<>();
        for(String s : strs){ //O(n)
            Double prime_mul = primeProduct(s); //O(k)
            if(!map.containsKey(prime_mul)){
                map.put(prime_mul, new ArrayList<>());
            }
            map.get(prime_mul).add(s);
        }
        return new ArrayList(map.values()); //O(n)

        }
    private Double primeProduct(String s){
        int[] primes = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        double result = 1;
        for (Character c : s.toCharArray()){
            result = result*primes[c - 'a'];
        }
    return result;
    }
}