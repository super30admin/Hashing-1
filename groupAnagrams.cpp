// Time Complexity : O(Nklogk) k is the length of the string and N is the length of the string 
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string, vector<string>> um;

        for (auto str : strs)
        {
            string temp = str;
            sort(temp.begin(), temp.end());
            um[temp].push_back(str);
        }

        vector<vector<string>> result;

        for (auto um_iter: um)
        {
            result.push_back(um_iter.second);
        }

        return result;
    }
};
