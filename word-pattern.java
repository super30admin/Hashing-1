// Time Complexity : o(N)
// Space Complexity :o(N)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

//https://leetcode.com/problems/word-pattern/

//here intially checking the base condition that the sizes of the string and # of words should be equal
//so if the number is present in both, then check if equal,
// number is present in only one. then it cant be true;
//otherwise we gotta store it in the hash map
class Solution {
    public boolean wordPattern(String pattern, String S) {
        String[] s = S.split(" ");
        // base case
        if (pattern.length() != s.length)
            return false;
        HashMap<Character, String> ps = new HashMap<>();
        HashMap<String, Character> sp = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String str = s[i];
            if (ps.containsKey(c) && sp.containsKey(str)) {
                if (sp.get(str) != c || !ps.get(c).equals(str))
                    return false;
            } else if (ps.containsKey(c) || sp.containsKey(str)) {
                return false;
            } else {
                ps.put(c, str);
                sp.put(str, c);
            }
        }
        return true;
    }
}