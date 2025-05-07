// WORD PROBLEM

// Time Complexity : O(k) where k is the length of the strings 
// Space Complexity : O(1) since there can only be 26 characters.
// Did this code successfully run on Leetcode : Yes, it successfully ran on leetcode.
// Any problem you faced while coding this : Some small syntax issues, can be very annoying and consume a lot of time
// Your code here along with comments explaining your approach

#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    bool wordPattern(string pattern, string s) {
        vector<string> v;
        string word;
        // making a string stream
        stringstream iss(s);
       // Push each word in vector
        while (iss >> word){
            v.push_back(word);
        }
        
        
        
        if(pattern.length()!= v.size()) return false;
        unordered_map<char, string> m;
        set<string> s1;
        for(int i=0; i<pattern.length(); ++i)
        {
            if(m.find(pattern[i]) != m.end())
            {
                if(m[pattern[i]] !=v[i]) return false;
                
            }
            else{
                if(s1.count(v[i]) > 0) return false;
                m[pattern[i]] = v[i];
                s1.insert(v[i]);
            }
          
           
        }
        return true;
    }
      
};

// int main()
// {
//     return 0;
// }