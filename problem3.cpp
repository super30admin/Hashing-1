// Time Complexity : O(n) where n = length of the pattern string
// Space Complexity : O(nW) (or) O(n) where W = length (width) of the longest word
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// We will be using 2 maps to store the letter associated with the word and the word associated with the letter and we check if the pattern is correct accordingly.

class Solution {
public:
    bool wordPattern(string pattern, string s) {
        unordered_map<char, string> char_map;
        unordered_map<string, char> word_map;
        
        stringstream st(s);
        string word;
        int n = pattern.size(), i = 0;
        
        while(st >> word){
            if(i == n) return false;
            char c = pattern[i];
            if(char_map.count(c) != word_map.count(word)) return false;
            if(char_map.count(c)){
                if( (word_map[word] != c) || (char_map[c] != word)) return false;
            } else {
                char_map.insert({c, word});
                word_map.insert({word, c});
            }
            i++;
        }
        return i == n;
    }
};