// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        map<char,char> mps;
        map<char,char> mpt;  

        if(s.size() != t.size()) return false; 
        if(s.size() == 1 && t.size() == 1) return true; 

        for(int i = 0; i < s.size(); i++) {
            // Check for ability to map in mps
            if(mps.find(s[i]) == mps.end()) {
                mps[s[i]] = t[i];
            } else {
                if(mps[s[i]] != t[i]) return false; 
            } 

            //Check for ability to map in mpt
            if(mpt.find(t[i]) == mpt.end()) {
                mpt[t[i]] = s[i];
            } else {
                if(mpt[t[i]] != s[i]) return false; 
            }
        }

        return true;                 
    }
};