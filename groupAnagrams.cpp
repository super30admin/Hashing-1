// Time Complexity : O(n * k), where n is no of words and k is the max characters of the string
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

#include <vector>
#include <iostream>
#include <unordered_map>
using namespace std;

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) 
    {
        vector<vector<string>> ans;
        int prime[] = {2,3,5,7,11,13,17,19,23,29,31,37,43,47,53,59,61,67,71,73,79,83,89,97,101,103};
        unordered_map<double,vector<string>> Map;

        for(auto str : strs)
        {
             double count=1;
            for(auto c : str)
            {
                count*=prime[c-'a'];
            }
            if(Map.find(count)!=Map.end())
            {
                Map[count].push_back(str);
            }
            else
            {
                Map[count] = {str};
            }
            
        }

        for(auto mapValue : Map)
        {
            ans.push_back(mapValue.second);
        }
        return ans;
    }
};