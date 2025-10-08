// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

/*
 * Approach
 * idea here is the same as the Isomorphic string but first we start with the operations we are spliting the wording so the we can
 * compare then seperatly 
 */

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] word = s.split(" ");

        if (pattern.length() != word.length)
            return false;
        HashMap<Character, String> CharMap = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            String str = word[i];
            char c = pattern.charAt(i);
            if (CharMap.containsKey(c)) {
                if (!CharMap.get(c).equals(str)) {
                    return false;
                }
            } else {
                CharMap.put(c, str);
                if (set.contains(str)) {
                    return false;
                }
                set.add(str);

            }

        }
        return true;
    }
}