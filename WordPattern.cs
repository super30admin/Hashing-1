// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

public class Solution {
    public bool WordPattern(string pattern, string s) {   
        Char[] separator = {' '};
        string[] str = s.Split(separator);
        
        if(pattern.Length != str.Length) { return false;}
        
        Dictionary<Char, string> sMap = new Dictionary<Char, string>();
        Dictionary<string, Char> tMap = new Dictionary<string, Char>();
        
        for(int i=0; i < pattern.Length; i++)
        {
            Char sChar = pattern[i];           
            if(!sMap.ContainsKey(sChar))
            {
                sMap[sChar] = str[i];
            }else
            {
                if(sMap[sChar] != str[i])
                    return false;
            }
            
            if(!tMap.ContainsKey(str[i]))
            {
                tMap[str[i]] = sChar;
            }else
            {
                if(tMap[str[i]] != sChar)
                    return false;
            }
        }       
        return true;        
    }
}
