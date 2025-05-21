//Time complexity - O(n)
// Space complexity - O(1)
// Faced any issues - No
// Solved on leetcode- yes
// need to check both the if s can be replaced by a character and get T and viceversa. So check at every individual character
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Character> tmap = new HashMap<>();

        if(s.length() != t.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            if (smap.getOrDefault(cs, ct) != ct || tmap.getOrDefault(ct, cs) != cs) {
                return false;
            }

            smap.put(cs, ct);
            tmap.put(ct, cs);
        }

        return true;
    }
}
