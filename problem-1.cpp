// 49. Group Anagrams
// Time Complexity : O(nklog(n))
// Space Complexity : O(n*k)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

/* 
    firstly iterating through the array, for every new type of sorted string will be stored as keys in a hashmap.
    if the sorted string matches any key in map then it will be stored in the corresponding value vector.
*/

// Your code here along with comments explaining your approach
class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string, vector<string>> umap;
        vector<vector<string>> ans;
        for(int i = 0; i < strs.size(); i++)
        {
            string s = strs[i];
            sort(s.begin(), s.end());
            umap[s].push_back(strs[i]);
        }
        for (auto it = umap.begin(); it != umap.end(); ++it) {
            ans.push_back(it->second);
        }
        return ans;
    }
};