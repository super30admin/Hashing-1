// Time Complexity : O(N) where N is the length of input string.
// Space Complexity : O(1) since just store alphabets in the Maps & Sets.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class IsomorphicStrings
{

    class Solution {
        public boolean isIsomorphicUsingHashSet(String s, String t) {
            HashMap<Character, Character> sMap = new HashMap(); // O(1) space
            HashSet<Character> tSet = new HashSet(); // O(1) space

            for(int i = 0; i < s.length(); i++) // O(n) length of string
            {
                char sChar = s.charAt(i);
                char tChar = t.charAt(i);
                if(!sMap.containsKey(sChar))
                {
                    sMap.put(sChar, tChar);
                    if (!tSet.contains(tChar))
                        tSet.add(tChar);
                    else
                        return false;
                }
                else if(sMap.get(sChar) != tChar)
                    return false;
            }
            return true;
        }
        public boolean isIsomorphicUsingHashMap(String s, String t)
        {
            HashMap<Character, Character> sMap = new HashMap();
            HashMap<Character, Character> tMap = new HashMap();

            for(int i = 0; i < s.length(); i++)
            {
                char sChar = s.charAt(i);
                char tChar = t.charAt(i);
                if(!sMap.containsKey(sChar))
                    sMap.put(sChar, tChar);
                else
                if(sMap.get(sChar) != tChar)
                    return false;

                if(!tMap.containsKey(tChar))
                    tMap.put(tChar, sChar);
                else
                if(tMap.get(tChar) != sChar)
                    return false;
            }
            return true;
        }
    }

}
