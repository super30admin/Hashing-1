//Time Complexity = O(NKlogK)  K = length of maximum string
//Space Complexity = O(NK) //We store all

//We sort each string and use the sorted version as key and store the unsorted versions as values
//We iterate through the hashmap in the end to add all the value vectors to our result vector

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) 
    {
        unordered_map<string,vector<string>> hash;
        vector<vector<string>> result;    
        for(int i=0;i<strs.size();i++){
            string store = strs[i];
            sort(strs[i].begin(),strs[i].end());
            hash[strs[i]].push_back(store);
        }
        for(auto itr= hash.begin();itr!=hash.end();itr++)
            result.push_back(itr->second);
        return result;
    }
};
