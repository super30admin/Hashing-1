// Time Complexity : O(n)
// Space Complexity : O(m + n)
// Did this code successfully run on Leetcode : yes

#include <bits/stdc++.h>
#include <iostream>
#include <vector>
#include <unordered_map>

using namespace std;

//using 2 hashmaps
class Solution {
public:
    bool wordPattern(string pattern, string s) {
        unordered_map<char, string> wordMap;
        unordered_map<string, char> rwordMap;
        string temp;
        vector<string> word;
        stringstream ss(s);

        while (ss >> temp){
            word.push_back(temp);
        }

        if(pattern.size() != word.size()) return false;

        for(int i = 0; i < word.size(); i++){
            if(wordMap.find(pattern[i]) == wordMap.end()){
                wordMap.insert(make_pair(pattern[i], word[i]));
            }
            else{
                if(wordMap[pattern[i]] != word[i]) return false;
            }
            if(rwordMap.find(word[i]) == rwordMap.end()){
                rwordMap.insert(make_pair(word[i], pattern[i]));
            }
            else{
                if(rwordMap[word[i]] != pattern[i]) return false;
            }
        }

        return true; 
    }
};