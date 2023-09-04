// Time Complexity : O(n) we traverse through strs linearly
// Space Complexity : O(n) we store all strings in the map
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes initially had problem coming up with comparison algorithm

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) return new ArrayList();
        HashMap<String, List> map = new HashMap<>();
        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList());
            }
            map.get(key).add(s);
        }

        return new ArrayList(map.values());
    }
}
