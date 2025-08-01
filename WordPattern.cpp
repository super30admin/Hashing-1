#include<iostream>
#include<bits/stdc++.h>
#include<vector>
using namespace std;
class Solution{
public:
    bool wordPattern(string pattern, string s) {
        vector<string> words;
        int start = 0;
        int pos;

        while ((pos = s.find(" ", start)) != -1) { // directly using " "
            words.push_back(s.substr(start, pos - start));
            start = pos + 1; // since delimiter is 1 character
        }
        words.push_back(s.substr(start)); // last word
        
        
        unordered_map<char, string> map1;
        unordered_map<string,char> map2;
       
        if(words.size()!=pattern.length()) return false;
        

        for(int i=0;i<pattern.size();i++){
            char patternMap=pattern[i];
            string wordMap=words[i];
            if(map1.count(patternMap)){
                if(map1[patternMap]!=wordMap) return false;
            }else map1[patternMap]=wordMap;

            if(map2.count(wordMap)){
                if(map2[wordMap]!=patternMap) return false;
            }else map2[wordMap]=patternMap;
        }
        return true;
    }
};
