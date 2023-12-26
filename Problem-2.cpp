// Time Complexity :  O(N)

// Space Complexity : O(1) -> O(26)

// Did this code successfully run on Leetcode : Yes

// Appoarch: Created a hashmap to store one way mapping
// and hashset to store the unique values.  

#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        map<char,char> smap;
        set<char> tset;
        if(s.length() != t.length()){
           return false;
        }
        for(int i=0;i<s.length();i++){
            if(smap.find(s[i])!=smap.end()){
              if(smap[s[i]]!=t[i]){
                 return false;
              }
           }
            else{
                if(tset.count(t[i])>0) return false;
                smap[s[i]] = t[i];
                tset.insert(t[i]);
            }
            
        } 
        return true;
    }
};