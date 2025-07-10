#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    bool wordPattern(string pattern, string s) {
        stringstream ss(s);
        vector<string>words;
        string x;
        while(ss>>x){
            words.push_back(x);
        }
        if(words.size()!=pattern.size())
            return false;
        unordered_map<char,string>hm_w;
        unordered_map<string,char>hm_p;
        for(int i=0;i<words.size();i++){
            if(hm_w.find(pattern[i])!=hm_w.end()){
                if(hm_w[pattern[i]]!=words[i])
                    return false;
            }
            else{
                if(hm_p.find(words[i])!=hm_p.end())
                    return false;
                hm_w[pattern[i]]=words[i];
                hm_p[words[i]]=pattern[i];
            }
        }
        return true;
    }
};