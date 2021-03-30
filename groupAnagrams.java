// Time Complexity :O(MN)
// Space Complexity :O(MN)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No

// Your code here  with comments explaining your approach

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0)
            return new ArrayList();
        HashMap<String, List> hmap = new HashMap<>();
        for (String s : strs) {
            // Create a char array ans store the count of each character
            char[] curr = new char[26];
            for (char c : s.toCharArray()) {
                curr[c - 'a']++;
            }
            // convert the array into a string
            String key = new String(curr);
            // If String not present make it as key and create new arraylist for that key
            if (!hmap.containsKey(key))
                hmap.put(key, new ArrayList());
            // add the string by fetching the value of key
            hmap.get(key).add(s);
        }
        return new ArrayList(hmap.values());
    }
}