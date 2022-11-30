// Time Complexity : O( nklogk), n is the length of the array, k is the length of the string. klogk -> sorting the string
// Space Complexity : O(nk) , n -> length of the array , k is the length of the string.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach in three sentences only
/*
 * we iterate through the array of string and for every string, we sort it and store it in the hashmap.
 * For storing in the hashmap we add key as the sorted string and as the value we add the actual string to form the group anagram.
 */

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);

            String sort = new String(chars);

            if (!map.containsKey(sort)) {
                map.put(sort, new ArrayList<>());
            }

            map.get(sort).add(str);

        }

        return new ArrayList(map.values());
    }
}