// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution 
{
    //using one hash map and one hash set
    unordered_map<char, char> sMap;
    unordered_set<char> tMap;
public:
    bool isIsomorphic(string s, string t) {
        if(s.size() != t.size()) return false;
        
        for(int i = 0; i < s.size(); i++)
        {
            if(sMap.find(s[i]) == sMap.end()) 
            {
                if(tMap.find(t[i]) != tMap.end()) return false;
                sMap[s[i]] = t[i];
                tMap.insert(t[i]);
            }
            else
            {
                if(sMap.at(s[i]) != t[i]) return false;
            }
        }
        return true;
    }
};
