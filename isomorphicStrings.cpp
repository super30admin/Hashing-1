// Time Complexity : O(N)
// Space Complexity : O(N)+O(N) //lengths of both the string 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : nope


// Your code here along with comments explaining your approach

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if (s.length() != t.length())
            return false;

        unordered_map<char, int> um;
        unordered_set<char> us;

        for (int i=0 ; i<s.length(); i++)
        {
            if (um.find(s[i]) == um.end())
            {   
                if (us.find(t[i]) != us.end())
                    return false;

                um[s[i]] = t[i];
                us.insert(t[i]);
            }
            else if (um[s[i]] != t[i])
            {
               return false;
            }
        }
        return true;
    }
};
