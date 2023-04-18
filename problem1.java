// Time Complexity : O(nklogk)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// We use a HashMap, Sort one string at a time and check if that key exists in map.
// If key not found, we insert an empty List and then add string to that list.
// If key found , we add String to the existing List.
// Atlast, we return List of all map values.


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length==0)
        {
            return new ArrayList<>();
        }
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i = 0;i<strs.length;i++)
        {
            String s = strs[i];
            char[] ChArray = s.toCharArray();
            Arrays.sort(ChArray);
            String SortedArray = String.valueOf(ChArray);
            if(!map.containsKey(SortedArray))
            {
                map.put(SortedArray,new ArrayList<>());
            }
            map.get(SortedArray).add(s);
        }
        return new ArrayList<>(map.values());
        
    }
}