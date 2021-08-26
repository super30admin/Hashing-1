// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
public:
    unordered_map<double, vector<string>> anagram_map;
    
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>> result;
        double key; 

        for (int i = 0; i < strs.size(); i++)
        {
            key = findKey(strs[i]);
            anagram_map[key].push_back(strs[i]);
        }
        
        for(auto strArray : anagram_map)
        {
            result.push_back(strArray.second);
        }
        return result;
    }
    double findKey(string strs)
    {
        double key = 1;
        vector<int> val = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
        for (int i = 0; i < strs.size(); i++)
        {
            key = key * (val[strs[i] - 'a']);
        }
        return key;
    }

    
};
