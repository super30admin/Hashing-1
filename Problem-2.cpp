//Time Complexity = O(N)
//Space Comlexity = O(1)                  //since string only contains the ASCII characters which are 256.

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        map<char,char> smp;
        map<char,char> tmp;
        for(int i=0;i<s.size();i++)
        {
            if(!smp[s[i]])
                smp[s[i]] = t[i];
            else if(smp[s[i]] != t[i])
                return false;
            if(!tmp[t[i]])
                tmp[t[i]] = s[i];
            else if(tmp[t[i]] != s[i])
                return false;
        }
        return true;
    }
};
