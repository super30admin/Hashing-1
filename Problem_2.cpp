
Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.



Example 1: Input: s = "egg", t = "add" Output: true

Example 2: Input: s = "foo", t = "bar" Output: false

Example 3: Input: s = "paper", t = "title" Output: true Note: You may assume both s and t have the same length.

Answer:-
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : No
// Any problem you faced while coding this :

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if (s.empty() && t.empty()) return true;
        if (s.empty() || t.empty()) return false;
        if (s.size() != t.size()) return false;
        unordered_map<char,char> sMap;
        unordered_map<char,char> tMap;

            for (int i = 0; i< s.size(); i++) {
                char sChar = s.at(i);
                char tChar = t.at(i);
                if (sMap.find(sChar) == sMap.end()) {
                    sMap.insert(std::pair<char, char>(sChar,tChar));
                } else {
                    auto it = sMap.find(sChar);
                    if ((it != sMap.end()) && (it->second != tChar)) return false;
                }
                if (tMap.find(tChar) == tMap.end()) {
                    tMap.insert(std::pair<char, char>(tChar,sChar));
                } else {
                    auto itt = tMap.find(tChar);
                    if ((itt != tMap.end()) && (itt->second != sChar)) return false;;
                }
            }
            return true;
    }
};
