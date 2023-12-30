// Time Complexity : O(n), where n is no of characters of the string
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

#include <vector>
#include <iostream>
#include<sstream>
#include<set>
#include <unordered_map>
using namespace std;

class Solution {
public:
    bool wordPattern(string pattern, string s) 
    {
        stringstream ss(s);  
        vector<string> words;
        string word;
        set<string> keyword;
        unordered_map<char,string> Umap;

        while (ss >> word) 
        {
            words.push_back(word);
        }
        if(pattern.length()!=words.size())
            return false;

        for(int i =0;i<pattern.length();i++)
        {
            if(Umap.find(pattern[i])!=Umap.end())
            {
                if((Umap[pattern[i]] != words[i]))
                    return false;
            }
            else
            {   if(keyword.find(words[i])!=keyword.end())
                    return false;
                Umap[pattern[i]] = words[i];
                keyword.insert(words[i]);
            }
        }
        return true;
    }
};