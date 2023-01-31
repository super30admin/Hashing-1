// Time Complexity : O(nk) where n is number of strings, k is length of each string
// Space Complexity : O(nk)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
/* We use a hashmap here. We use prime product for a unique key value of all anagrams. When the key does not exist we create one with
   prime product of string. Since all anagrams will have same prime product, we add strings with same prime product in a list with prime
   product as a key and return it.
*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0)
            return new ArrayList<>();

        int primes[] = primeArrGen();

        HashMap<Double, List<String>> hmap = new HashMap<>();

        for(String str : strs) {
            double primeProd = primeProduct(str, primes);
            if(!hmap.containsKey(primeProd))
                hmap.put(primeProd, new ArrayList<>());
            hmap.get(primeProd).add(str);
        }
        return new ArrayList<>(hmap.values());
    }

    private double primeProduct(String str, int[] primes) {
        double result = 1;

        for(Character c : str.toCharArray()) {
            int prime = primes[c - 'a'];
            result *= prime;
        }
        return result;
    }

    private int[] primeArrGen() {
        int[] arr = new int[26];
        int num = 3;
        int status = 0;

        arr[0] = 2;

        for(int i = 1; i < 26; ) {
            for(int j = 2; j <= Math.sqrt(num); ++j) {
                if(num % j == 0) {
                    status = 1;
                    break;
                }
            }
            if(status == 0) {
                arr[i] = num;
                ++i;
            }

            num++;
            status = 0;
        }
        
        return arr;
    }
}