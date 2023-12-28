//TC = O(n)
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
        HashSet<Character> tSet = new HashSet<>();
        for(int i = 0; i < s.length(); i++)
        {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(!sMap.containsKey(sChar))
            {
                if(tSet.contains(tChar)) return false;
                sMap.put(sChar, tChar);
                tSet.add(tChar);

            }
            else
            {
                if(sMap.get(sChar) != tChar) return false;  
            }
        }
        return true;
    }
}