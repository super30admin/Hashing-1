//Time Complexity: O(n), where n is the length of strings s and t
//Space Complexity: O(n), where n is the length of strings s and t
//Code solved in leetcode: Yes
//Approach in 3 lines:
// 1. Iterate through each character in strings `s` and `t`.
// 2. Maintain two HashMaps to map characters from `s` to `t` and vice versa.
// 3. If a character is already mapped inconsistently or mapped to a different character, return false; otherwise, return true.

class Solution {
    public bool isIsomorphic(String s, String t) {
        if(s == null && t == null) return true;
        if(s== null || t ==  null) return false;

        if(s.length() != t.length()) return false;

        HashMap<char, char> sMap = new HashMap<>();
        HashMap<char, char> tMap = new HashMap<>();

        for(int i=0; i< s.length; i++)
        {
            char sChar = s.charAt(i);
            char tchar = t.charAt(i);

            if(sMap.containsKey(sChar))
            {
                if(sMap.get(sChar) != tChar)
                {
                     return false;
                }
                else
                {
                    sMap.put(sChar, tChar);
                }
            }
            if(tMap.containsKey(tChar))
            {
                if(tMap.get(tChar) != sChar) return false;
                else
                {
                    tMap.put(tChar, sChar);
                }
            }
        }
        return true;      
    }
}