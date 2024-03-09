// Time Complexity : O(n k), where n is pattern length and k is string length for string comparison at each index
// Space Complexity : 0(n k)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Approach : Create a map of each character in pattern string against the corresponding string word.
//            Store the string words in a set so the same word is not a value for 2 different letters
//            If a character has a corresponding value thats not equal to the word in the string at that index, return false

// Your code here along with comments explaining your approach
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        String[] sa = s.split(" ");

        if (sa.length != pattern.length())
            return false;

        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i))) {
                if (!map.get(pattern.charAt(i)).equals(sa[i])) {
                    return false;
                }
            } else {
                map.put(pattern.charAt(i), sa[i]);
                if (set.contains(sa[i]))
                    return false;
                else
                    set.add(sa[i]);
            }
        }
        return true;
    }
}