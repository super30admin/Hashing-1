// Leetcode problem : https://leetcode.com/problems/isomorphic-strings/description/
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only
/*
 I have created two hashmaps sMap and tMap which store the character mapping from string s to t and string t to s respectively. I 
 traverse through each character of both s and t and check : 
 1. If sMap contains the character in s, if so I check if the corresponding value is same as that of the character in t. If not I return false.
 If sMap doesn't contain the character in s, I add it to the map as the key with the character in t as the corresponding value.
 2. Similarly, I check the same for t in tMap.
 After all characters have been traversed, I return true.
 */
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        HashMap<Character,Character> sMap = new HashMap<>();
        HashMap<Character,Character> tMap = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sMap.containsKey(sChar))
            {
                if(sMap.get(sChar)!=tChar)
                {
                    return false;
                }
            }
            else
            {
                sMap.put(sChar,tChar);
            }
            if(tMap.containsKey(tChar))
            {
                if(tMap.get(tChar)!=sChar)
                {
                    return false;
                }
            }
            else
            {
                tMap.put(tChar,sChar);
            }
        }
        return true;
    }
}