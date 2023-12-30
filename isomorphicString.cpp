// Time Complexity : O(n), where n is characters of the string
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

#include <vector>
#include <iostream>
#include <unordered_map>
using namespace std;

class Solution {
public:
    bool isIsomorphic(string s, string t) {

        if(s.length()!=t.length())
        {
            return false;
        }

        unordered_map<char,char> umaps;
        unordered_map<char,char> umapt;

        for(int i=0;i<s.length();i++)
        {
            if(umaps.find(s[i])!=umaps.end() && umaps[s[i]] != t[i])
            {
                return false;
            }
            umaps[s[i]] = t[i];
            if(umapt.find(t[i])!=umapt.end() && umapt[t[i]] != s[i])
            {
                return false;
            }
            umapt[t[i]] = s[i];
        }
        return true;
        
    }
};