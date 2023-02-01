class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>> ans;
        unordered_map<string, vector<string>> map_an;
        for(int i =0; i< strs.size(); i++){
            string s = strs[i];
            sort(strs[i].begin(),strs[i].end());
            map_an[strs[i]].push_back(s);
        }
        for(auto it : map_an ){
            ans.push_back(it.second);
        }
        return ans;
    }
};