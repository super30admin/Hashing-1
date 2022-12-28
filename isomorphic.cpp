class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if(s.length()!=t.length()){return false;}
        if(s.empty()||t.empty()){return false;}
        if(s.empty() && t.empty()){return true;}

        unordered_map<char,char>smap;
        unordered_map<char,char>tmap;
        for(int i=0;i<s.length();i++){
            if(smap.find(s[i])==smap.end()){
                smap[s[i]]=t[i];
            }
            else {
                if(smap[s[i]]!=t[i]){
                    return false;
                }
            }
             if(tmap.find(t[i])==tmap.end()){
                tmap[t[i]]=s[i];
            }
            else {
                if(tmap[t[i]]!=s[i]){
                    return false;
                }
            }
        }
        return true;
    }
};
