//Main Idea: This problem is exactly like a Isomorphic String problem.
//Time Complexity :O(N + M)-> N is the length of a String. M is the length of the pattern. O(N)-To split the string because it scans over entire string.
// Space Complexity : O(N + M)-> o(N)- When we conevert String to String Array. o(M) to store pattern into character array.

// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No
class Solution {
    public boolean WordPattern(String pattern, String s) {
        if (pattern == null || s == null || s.length() == 0 || pattern.length() == 0)
            return false;

        char[] chars = pattern.toCharArray(); 
        String[] strings = s.split("\s");//Time O(N) and space

        if (chars.length != strings.length)
            return false;

        Map<Character, String> patternMap = new HashMap<>();
        Map<String, Character> stringMap = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {// time O(M)
            if (!patternMap.containsKey(chars[i])) {
                patternMap.put(chars[i], strings[i]);

            } else {
                if (!patternMap.get(chars[i]).equals(strings[i])) {
                    return false;
                }
            }

            if (!stringMap.containsKey(strings[i])) {
                stringMap.put(strings[i], chars[i]);

            } else {
                if (!stringMap.get(strings[i]).equals(chars[i])) {
                    return false;
                }
            }

        }
        return true;

    }
}