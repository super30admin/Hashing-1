// Time Complexity : O(k + l) where k&l are the length of the 2 strings 
// Space Complexity : O(1) since there can only be 26 characters.
// Did this code successfully run on Leetcode : Yes, it successfully ran on leetcode.
// Any problem you faced while coding this : Not really, some minor syntax issues.
// Your code here along with comments explaining your approach



#include<bits/stdc++.h>
using namespace std;



class Solution {
public:
    bool isIsomorphic(string s, string t) {
      if(s.length() != t.length()) return false;  // if the 2 strings are not of the same length, they are not ismorphic.
        unordered_map<char, char> sMap;  
        unordered_map<char, char> tMap;   // creating 2 maps for both the strings 
        for(int i = 0; i<s.length(); i++)
        {
            if(sMap.find(s[i]) == sMap.end())
            {
                sMap.insert(make_pair(s[i], t[i]));   // if char is not in map insert into map
            }
            if(sMap[s[i]] != t[i]) return false;   // if different value found, return false
        }
          for(int i = 0; i<t.length(); i++)
        {
            if(tMap.find(t[i]) == tMap.end())
            {
                tMap.insert(make_pair(t[i], s[i]));   // same as above
            }
            if(tMap[t[i]] != s[i]) return false;
        }
        return true;
    }
};

int main(){
    
    return 0;
}