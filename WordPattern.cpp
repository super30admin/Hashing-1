// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
public:
    bool wordPattern(string pattern, string s) {
        vector<std::string> words;
        map<char,string> pattern_word;
        map<string,char> word_pattern;  
        stringstream ss(s);
        string word;

    while (std::getline(ss, word, ' ')) {
        words.push_back(word);
    }

    if(pattern.size() != words.size()) return false; 

    for(int i = 0; i < pattern.size(); i++) {
        // Check for bijection in pattern_word map
        if(pattern_word.find(pattern[i]) == pattern_word.end()) {
            pattern_word[pattern[i]] = words[i]; 
        } else {
            if(pattern_word[pattern[i]] != words[i]) return false; 
        }

        //Check for bijection in word_pattern map
        if(word_pattern.find(words[i]) == word_pattern.end()) {
            word_pattern[words[i]] = pattern[i];
        } else {
            if(word_pattern[words[i]] != pattern[i]) return false; 
        }
    }

    return true; 
    
    }
};