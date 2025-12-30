class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string,vector<string>> map;

        for(int i = 0;i<strs.size();i++){
            string& str = strs[i];

            string sortedStr = str;//create a new string to store sorted characters
            sort(sortedStr.begin(), sortedStr.end());//sort the characters

            map[sortedStr].push_back(str); // at key sortedStr,push all the words that comprise of the characters
        }

        vector<vector<string>> result;
        for (auto& pair : map) {
            result.push_back(pair.second);//compute and collect all anagram and return result
        }

        return result;

    }
};