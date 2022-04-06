// Time Complexity : O(nk)
// Space Complexity : O(nk)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int[] PRIMES = new int[]{2, 3, 5, 7, 11 ,13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 107};
        HashMap<Double, List<String>> map = new HashMap<>(); 
        for(String s:strs){
            double prod = 1;
            for(char c: s.toCharArray()){
                prod = prod*PRIMES[c-'a'];
            }
            if(!map.containsKey(prod)){
                map.put(prod,new ArrayList<String>());
            }
            map.get(prod).add(s);
        }
        return new ArrayList<>(map.values());
    }
}