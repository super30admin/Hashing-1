// Time Complexity : O(nmlogm) where m is maximum length of the string and log m for sorting
// Space Complexity : O(nm)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
//Hash map is created with key as sorted sting and the list is created for the each unsorted string
//the list is returned as the answeer 
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) return new ArrayList<>();
        HashMap<String, List> ans = new HashMap<>();
        for(String s:strs){
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if(!ans.containsKey(key)){
                ans.put(key,new ArrayList<>());
            }
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }
}