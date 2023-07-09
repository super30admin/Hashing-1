import java.util.HashMap;

// Time Complexity : O(nklogk) -> klogk is becz we used sorting
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap();
        String sortedString;
        for(int i = 0; i<=strs.length-1 ; i++) {
            char[] sortedArray = strs[i].toCharArray();
            Arrays.sort(sortedArray);
            sortedString = Arrays.toString(sortedArray);
            if(!map.containsKey(sortedString)){
                map.put(sortedString, new ArrayList<>());

            }
            map.get(sortedString).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}