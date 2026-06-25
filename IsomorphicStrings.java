// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Use two hash maps to maintain a one-to-one mapping between characters in both strings.
// If an existing mapping is inconsistent in either direction, the strings are not isomorphic.
// If all character pairs satisfy the bidirectional mapping, the strings are isomorphic.

class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> reverseMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(map.containsKey(sChar)) {
                if(map.get(sChar) != tChar) {
                    return false;
                }
            }

            if(reverseMap.containsKey(tChar)) {
                if(reverseMap.get(tChar) != sChar) {
                    return false;
                }
                continue;
            }

            map.put(sChar, tChar);
            reverseMap.put(tChar, sChar);

        }

        return true;
    }
}