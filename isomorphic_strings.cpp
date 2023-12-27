// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// We use a map to store 1:1 mapping between s and t. We also use set to store t if its been used. 
// for every element in s, we check it in map, if it isnt present then we check it in set to see if t element 
// has been already mapped. We return false if its mapped already. If not we add it to map and set and return true

#include<string>
#include <iostream>
#include<unordered_set>
#include<unordered_map>

class Solution {
public:
    bool isIsomorphic(std::string s, std::string t) {
        if(s.length() != t.length())
        {
            return false;
        }
        
        std::unordered_map<char, char> sMap;
        std::unordered_set<char> tSet;

        for(int i=0; i< s.length(); i++)
        {
            char sCh = s[i];
            char tCh = t[i];
            if(sMap.find(sCh) == sMap.end())
            {
                if(tSet.find(tCh) != tSet.end())
                {
                    return false;
                }
                else
                {
                    sMap[sCh] = tCh;
                    tSet.insert(tCh);
                }
            }
            else
            {
                if(sMap[sCh] != tCh)
                {
                    return false;
                }
            } 
        }
        return true;
    }
};