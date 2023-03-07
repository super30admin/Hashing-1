class Solution {
public:
    bool isIsomorphic(string s, string t) {
        unordered_map<char, int> umap;
        unordered_set<char> unorderedSet;
        if(s.empty() || t.empty()) return false;
        if(s.length() != t.length()) return false;
        for(int i=0; i< s.length();i++){
            if( unorderedSet.find(t[i]) == unorderedSet.end() ){
                
                cout<<t[i];
            }
            if(umap.find(s[i]) == umap.end() && unorderedSet.find(t[i]) == unorderedSet.end() ){
                umap[s[i]] = t[i];
                unorderedSet.insert(t[i]);
            } 
            else if ( umap.find(s[i]) != umap.end() && umap[s[i]] != t[i]){
                    return false;
            }
            else if(umap.find(s[i]) == umap.end() && unorderedSet.find(t[i]) != unorderedSet.end()){
                     return false;
            }
        }
        return true;
        
    }
};