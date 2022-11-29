// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

public class Solution {
    public bool IsIsomorphic(string s, string t) {        
        if(s.Length != t.Length){ return false;}

        Dictionary<Char, Char> sMap = new Dictionary<Char, Char>();
        Dictionary<Char, Char> tMap = new Dictionary<Char, Char>();

        for(int i=0; i < s.Length; i++)
        {
            Char sChar = s[i];
            Char tChar = t[i];

            if(!sMap.ContainsKey(sChar))
            {
                sMap[sChar] = tChar;
            }else
            {
                if(sMap[sChar] != tChar)
                    return false;
            }

            if(!tMap.ContainsKey(tChar))
            {
                tMap[tChar] = sChar;
            }else
            {
                if(tMap[tChar] != sChar)
                    return false;
            }
        }

        return true;

    }
}
