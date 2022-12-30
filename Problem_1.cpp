
Given an array of strings, group anagrams together.

Example: Input: ["eat", "tea", "tan", "ate", "nat", "bat"], Output: [ ["ate","eat","tea"], ["nat","tan"], ["bat"] ]

Note: All inputs will be in lowercase. The order of your output does not matter.

Answer:-
// Time Complexity : O(nk)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : 

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string, vector<string>> mp;
        for (string s : strs) { //n time complexity
            mp[strSort(s)].push_back(s);
        }
        vector<vector<string>> anagrams;
        for (auto p : mp) { //n time complexity
            anagrams.push_back(p.second);
        }
        return anagrams;
    }
private:
    string strSort(string s) {
        int n = s.size(), counter[26] = {0};
        for (char c : s) { // k time complexity
            counter[c - 'a']++;
        }
        string t;
        for (int c = 0; c < 26; c++) { // k time complexity
            t += string(counter[c], c + 'a');
        }
        return t;
    }
};
