/* Problem 1:
// Time Complexity : O(NKlogK), where N is the length of strs, and K is the maximum length of a string in strs
// Space Complexity : O(NK)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : yes
*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        if (strs == null || strs.length == 0)
            return new ArrayList<List<String>>();

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String str1 = new String(charArray);

            if (map.containsKey(str1)) {
                map.get(str1).add(str);
            } else {
                map.put(str1, new ArrayList<>());
                map.get(str1).add(str);
            }

        }
        return new ArrayList<>(map.values());

    }
}