// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution { // using 2 hashmaps
public:
    unordered_map<char, string> charToStringMap;
    unordered_map<string, char> stringToCharMap;
    
    bool wordPattern(string pattern, string s) {
        istringstream ss(s);
        vector<string> stringArray;
        string word;
        while (ss >> word) stringArray.push_back(word);
        if(pattern.length() != stringArray.size()) return false;
        for (int i = 0; i < pattern.length(); i++)
        {
            if (charToStringMap.find(pattern[i]) == charToStringMap.end())
                charToStringMap[pattern[i]] =  stringArray[i];
            else 
            {
                if(charToStringMap[pattern[i]] != stringArray[i]) return false;
            }
            
            if (stringToCharMap.find(stringArray[i]) == stringToCharMap.end())
                stringToCharMap[stringArray[i]] =  pattern[i];
            else 
            {
                if(stringToCharMap[stringArray[i]] != pattern[i]) return false;
            }
        }
        return true;
    }
};
