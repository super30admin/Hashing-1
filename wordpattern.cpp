// Time Complexity : O(n) where n is the length of the pattern
// Space Complexity : O(1) if maps are not considered, O(n) if they are
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
public:
    bool wordPattern(string pattern, string s) {
        unordered_map<char, string> mp1;
        unordered_map<string, char> mp2;
        vector<string> words;
        string word;

        for(char ch : s)
        {
            if(ch == ' ')
            {
                words.push_back(word);
                word = "";
            }
            else
                word += ch;
        }

        words.push_back(word);

        if(words.size() != pattern.size())
            return false;

        for(int i=0; i<pattern.size(); i++)
        {
            if(mp1.find(pattern[i]) != mp1.end() && mp1[pattern[i]] != words[i])
                return false;
            if(mp2.find(words[i]) != mp2.end() && mp2[words[i]] != pattern[i])
                return false;

            mp1[pattern[i]] = words[i];
            mp2[words[i]] = pattern[i];
        }
        return true;
        
    }
};