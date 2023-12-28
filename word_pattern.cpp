// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// We use a map to store 1:1 mapping between pattern and s. We also use set to store split strings from s if its been used. 
// for every element in pattern, we check it in map, if it isnt present then we check it in set to see if split strings  
// has been already mapped. We return false if its mapped already. If not we add it to map and set and return true.

#include<vector>
#include<iostream>
#include<string>
#include<unordered_set>
#include<unordered_map>

class Solution {
public:
    bool wordPattern(std::string pattern, std::string s) {
        int count = 0;
        std::string tmp;
        std::stringstream ss(s);
        std::vector<std::string> vString;
        while(std::getline(ss, tmp, ' '))
        {
            count++;
            vString.push_back(tmp);
        }

        if(pattern.length() != count)
        {
            return false;
        }

        std::unordered_map<char, std::string> map;
        std::unordered_set<std::string> sSet;
        for(int i = 0; i<vString.size(); i++)
        {
            char ch = pattern[i];
            std::string str = vString[i];
            if(map.find(ch) == map.end())
            {
                if(sSet.find(vString[i]) != sSet.end())
                {
                    return false;
                }
                else
                {
                    map[ch] = vString[i];
                    sSet.insert(vString[i]);
                }
            }
            else
            {
                if(map[ch] != vString[i])
                {
                    return false;
                }
            }
        }
        return true;
    }
};