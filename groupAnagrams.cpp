class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) 
    {  
        unordered_map<string, vector<string>> anagramsMap;
        for (const auto &str : strs) {
            string sortedStr = str;
            sort(sortedStr.begin(), sortedStr.end());
            if (!anagramsMap.contains(sortedStr)) {
                anagramsMap[sortedStr] = vector<string>();
            }

            anagramsMap[sortedStr].push_back(str);
        }

        vector<vector<string>> result;

        for (const auto &pair: anagramsMap) {
            result.push_back(anagramsMap[pair.first]);
        }

        return result;
    }
};
