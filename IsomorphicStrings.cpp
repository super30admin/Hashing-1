class Solution {
public:
    bool isIsomorphic(string s, string t) {
unordered_map<char, char> mp;
unordered_set<char> setMp;

        if(s.empty() && t.empty()) return false;

        if(s.size() != t.size())
        return false;

        for(int i = 0; i<s.size();i++)
        {
            char sChar = s[i];
            char tchar = t[i];

            if(mp[sChar - '']) != 0)
            {
            {
                if(mp[sChar - ''] != tChar)
                return false;
            }
            else
            {
                if(setMp[tChar - ''] != 0) 
                return false;

               setMp[tChar - ''] = tChar;
               mp[sChar-''] = tChar;
            }
            }
        }
        
        return true;
    }  
};