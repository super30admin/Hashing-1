// Time Complexity :O(n*mlogm) where n is number of strings and m is max length of the string
// Space Complexity :O(n*m)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no
// For every string, sort its characters and use the sorted string as the key in a HashMap
// The corresponding value is a list containing all strings that have the same sorted form

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] sorted = str.toCharArray();
            Arrays.sort(sorted);
            String sortedStr = String.valueOf(sorted);
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());// new entry to map
            }
            map.get(sortedStr).add(str);// add word to the map
        }
        return new ArrayList<>(map.values());
    }
}