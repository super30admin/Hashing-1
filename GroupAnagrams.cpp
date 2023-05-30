//Time Complexity : O(nlogn)
// Space Complexity : O(n)

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        map<string,vector<int>> mp;
        vector<string> strsCopy = strs; 

        for(int i = 0; i < strsCopy.size(); i++) {
            sort(strsCopy[i].begin(), strsCopy[i].end());
            mp[strsCopy[i]].push_back(i);
        }

        vector<vector<string>> result; 

        for(auto it : mp) {
            vector<int> indexes = it.second; 
            vector<string> ans; 
            for(int i = 0; i < indexes.size(); i++) {
                ans.push_back(strs[indexes[i]]);
            }
            result.push_back(ans);
        }

        return result;     
    }
};