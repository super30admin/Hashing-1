// Time Complexity : O(n klogl), where k = length of string
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>> ans;
        unordered_map<string,vector<string>> map1;
        for(int i = 0; i<strs.size();i++){
            string str = strs[i];
            sort(strs[i].begin(),strs[i].end());
            map1[strs[i]].push_back(str);
        }
        
        for(auto i = map1.begin(); i != map1.end(); i++)
            ans.push_back(i -> second);  
        return ans;
        
        
    }
};