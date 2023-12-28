
//TC = O(n) where n = length of the string
//SC = O(1)
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s == null && t == null)
            return true;
        if (s == null || t == null)
            return false;
        if (s.length() != t.length())
            return false;
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // check mapping from s-> t
            if (!sMap.containsKey(sChar)) {
                sMap.put(sChar, tChar);
            } else {
                // already present
                if (sMap.get(sChar) != tChar)
                    return false;
            }

            // check mapping from t->s
            if (!tMap.containsKey(tChar)) {
                tMap.put(tChar, sChar);
            } else {
                // already present
                if (tMap.get(tChar) != sChar)
                    return false;
            }

        }
        return true;

    }
}