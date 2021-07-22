// Time Complexity : O(N) where N = length of the String s or t
// Space Complexity : O(N). HashMap.
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : None.

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }
        
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();
        
        int len = s.length();
        // for every char in s map it with the charatcer at its position in t if mapping already doesnt exists
        // if mapping already exists then check if they are matching with their counter maps
        // if not return false
        for(int i = 0; i < len; i++)
        {
            char sCh = s.charAt(i);
            char tCh = t.charAt(i);
            
            if(!sMap.containsKey(sCh))
            {
                sMap.put(sCh, tCh);
            }
            
            if(!tMap.containsKey(tCh))
            {
                tMap.put(tCh, sCh);
            }
            
            if(tMap.get(tCh) != sCh || sMap.get(sCh) != tCh)
            {
                return false;
            }
        }
        
        return true;
    }
}