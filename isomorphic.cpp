// Time Complexity : O(N), where N = length of string s/t
//=SC = O(1)

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if(s.size() != t.size())
            return false;
        unordered_map<char, char> m1;
        unordered_map<char, char> m2;
        for(int i = 0; i < s.size(); i++){
            m1[s[i]] = t[i];
            m2[t[i]] = s[i];
        }
        for(int i = 0; i < s.size(); i++)
        {
            if(m1[s[i]] != t[i] || m2[t[i]] != s[i])
                return false;
        }
            
        return true;
    }
};