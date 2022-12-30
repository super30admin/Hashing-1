

Given a pattern and a string str, find if str follows the same pattern. Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Example 1: Input: pattern = "abba", str = "dog cat cat dog" Output: true

Example 2: Input:pattern = "abba", str = "dog cat cat fish" Output: false

Example 3: Input: pattern = "aaaa", str = "dog cat cat dog" Output: false

Example 4: Input: pattern = "abba", str = "dog dog dog dog" Output: false Notes: You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.

Answer:-
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : getting wrong answer for case :- pattern = "abba" , s = "dog cat cat dog"

class Solution {
public:
    bool wordPattern(string pattern, string s) {
        if (s.empty() && pattern.empty()) return true;
        if (s.empty() || pattern.empty()) return false;
        if (s.size() != pattern.size()) return false;

        unordered_map<char,string> sMap;
        unordered_map<string,char> tMap;
        string delimiter = " ";
        string strs[3000]; 
        size_t pos = 0;
        int j =0;
        while ((pos = s.find(delimiter)) != std::string::npos) {
            strs[j] = s.substr(0, pos);
            j++;
        }

            for (int i = 0; i< s.size(); i++) {
                char pChar = pattern.at(i);
                string temp = strs[i];
                
                if (sMap.find(pChar) == sMap.end()) {
                    sMap.insert(std::pair<char, string>(pChar,temp));
                } else {
                    auto it = sMap.find(pChar);
                    if ((it != sMap.end()) && (it->second != temp)) return false;
                }
                if (tMap.find(temp) == tMap.end()) {
                    tMap.insert(std::pair<string, char>(temp,pChar));
                } else {
                    auto itt = tMap.find(temp);
                    if ((itt != tMap.end()) && (itt->second != pChar)) return false;;
                }
            }
            return true;
    }        
};

