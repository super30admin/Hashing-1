class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if(s.length()!=t.length())return false;
        if(s.length() ==0 && t.length()==0)return true;
        unordered_map<char, char> sMap;
        unordered_map<char, char> tMap;
        for(int i=0;i<s.length();i++){
            char sChar = s[i];
            char tChar = t[i];
            if(sMap.count(sChar)){
                if(sMap[sChar]!=tChar) return false;
            }
            else sMap[sChar]= tChar;
            if(tMap.count(tChar)){
                if(tMap[tChar]!=sChar)return false;
            }
            else tMap[tChar]= sChar;   
        }
    return true;
    }
};
