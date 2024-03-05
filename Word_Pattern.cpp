// Time Complexity : O(N)   .... N is length of the pattern string
// Space Complexity : O(N*K)  .... N is length of the pattern string and K is avg size of each word in string s
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : 

/*
Leetcode : https://leetcode.com/problems/word-pattern/

Given a pattern and a string s, find if s follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
*/


/*
This question is similar to isomorphic strings, but in one string we need to consider one character
at a time and in another string we need to consider one word ata time.

Word String is converted into the vector of strings using ' ' as a delimiter.
*/


class Solution {
public:
    bool wordPattern(string pattern, string s) {

        // Create an input string stream from the input string
        std::istringstream iss(s);

        // Vector to store the individual words
        vector<std::string> words;

        string word;
        // Extract words from the string stream using space (" ") as delimiter
        while (std::getline(iss, word, ' ')) {         // O(N)
            words.push_back(word);
        }

        if (pattern.size() == 0 && words.size() == 0) return true;
        if (pattern.size() != words.size()) return false;

        std::unordered_map<char, string> sMap;
        std::unordered_map<string, char> tMap;
        int size = words.size();

        for (int idx = 0; idx<size; idx++){                // O(N)
            if (sMap.find(pattern.at(idx)) == sMap.end()){
                sMap[pattern.at(idx)] = words[idx];
            } else {
                if(sMap[pattern.at(idx)] != words[idx]) return false;
            }
            if (tMap.find(words[idx]) == tMap.end()){
                tMap[words[idx]] = pattern.at(idx);
            } else {
                if(tMap[words[idx]] != pattern.at(idx)) return false;
            }
        }

        return true;

    }
};