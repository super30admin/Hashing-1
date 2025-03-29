/* Time complexity: O(N*K)
 * Space complexity: O(N*K)
 */

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double, List<String>> map = new HashMap<>();

        for(String str : strs){ //O(N)
            double hash = getHash(str); //O(k)

            if(!map.containsKey(hash)){ //O(1)
                map.put(hash, new ArrayList<>());
            }
            map.get(hash).add(str); //O(1)
        }
        return new ArrayList<>(map.values());
    }

    private double getHash(String str){
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        double hash = 1;

        for(char c : str.toCharArray()){
            hash = hash * primes[c - 'a'];
        }
        return hash;
    }
}