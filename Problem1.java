// Time Complexity : O(nklogk) where k is the average length of all words
// Space Complexity : O(nk)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No



class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sorted = String.valueOf(charArr);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        }
        return new ArrayList<>(map.values());
    }
}