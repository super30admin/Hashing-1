class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        if(strs.size()==0)return {{0,0}};
        vector<vector<string>> result;
        unordered_map<string, vector<string>> myMap;
        for(int i=0;i<strs.size();i++){
            string temp = strs[i];
            sort(temp.begin(), temp.end());
            myMap[temp].push_back(strs[i]);
        }
        for(auto itr:myMap){
            result.push_back(itr.second);
        }
        return result;
    }
};
