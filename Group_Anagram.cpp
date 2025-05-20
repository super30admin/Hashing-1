//I created a unordered_map (hashmap) and then checked if the sorted string is present in the map, if not add a new , if present then add the current string to the vector. At the end add all the vectors into a vector and return.
//Time complexity O(n (k log k +k))
class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string, vector<string>> map;
        for(string str : strs){
            string key = str;
            sort(key.begin(), key.end());
            map[key].push_back(str);
        }
        vector<vector<string>> result;
        for(auto& pair : map){
            result.push_back(pair.second);
        }
        return result;
    }
};
