//Time complexity: O(n*mlogm)
//Space complexity:O(n)

//approach: idea here is to sort each string and check if that exist in map
// if yes then add it in the list for the sorted key string

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        
        vector<vector<string>> ans;
        unordered_map<string, vector<string>> map;
        for(int i=0; i<strs.size();++i)
        {
            string temporary=strs[i];
            sort(temporary.begin(),temporary.end());       
                map[temporary].push_back(strs[i]);
        }
        for(auto [key,val]:map)
        {
            ans.push_back(val);
        }
        return ans;
    }
};