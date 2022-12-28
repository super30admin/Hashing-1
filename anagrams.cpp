class Solution {
public:
//tc:n(klogk+k)
//sc:O(n)
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>> output;
        unordered_map<string,vector<string>>umap; //sc:O(nk)
        for(auto str:strs){
            string temp = str;//klogk
            sort(temp.begin(),temp.end());
            umap[temp].push_back(str);
        }
        output.reserve(umap.size());
        for(auto &vec:umap){
            output.push_back(vec.second);
        }

    return output;
    }

};
