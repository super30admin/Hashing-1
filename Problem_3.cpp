/*
 * Time Complexity : O(n + m)
 * Space Complexity : O(n + m)
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : No


 ? Your code here along with comments explaining your approach
   I made an input string stream to get the words from the s string.
   I then added it to a vector of strings and checked if the size
   matches with that of the pattern.
   I created 2 hashmaps to keep a track of the the letter patterns
   that map to the words and also the words with the corresponding
   letter pattern and if any of them are not unique then I return
   false.
*/

#include <string>
#include <unordered_map>
#include <sstream>
#include <vector>

class Solution {
public:
    bool wordPattern(std::string pattern, std::string s) {
        std::unordered_map<char, std::string> char_map;
        std::unordered_map<std::string, char> word_map;
        std::istringstream iss(s);
        std::vector<std::string> words;
        std::string word;

        while (iss >> word) {
            words.push_back(word);
        }

        if (pattern.size() != words.size()) {
            return false;
        }

        for (int i = 0; i < pattern.size(); i++) {
            if (char_map.contains(pattern[i]) && char_map[pattern[i]] != words[i])
                return false;
            if (word_map.contains(words[i]) && word_map[words[i]] != pattern[i])
                return false;
            char_map[pattern[i]] = words[i];
            word_map[words[i]] = pattern[i];
        }
        return true;
    }
};