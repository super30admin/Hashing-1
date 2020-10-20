// Time Complexity : O(N K log K)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0 || strs == null){
            return new ArrayList();
        } 
        Map<String, List<String>> map = new HashMap<String,List<String>>();
        for(String s : strs){ //O(N)
            char[] c = s.toCharArray(); //O(K)
            Arrays.sort(c); //O(K log K)
            String key = String.valueOf(c); //O(K)
            if(!map.containsKey(key)){ //O(K) - key conversion to hash time
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(s); // O(1)
        }
        return new ArrayList(map.values());
    }
}