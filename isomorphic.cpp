// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes

#include <bits/stdc++.h>
#include <iostream>
#include <vector>
#include <unordered_map>
#include <unordered_set>

using namespace std;

// using hashmap and hashset
class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if(s.size() != t.size()) return false;

        unordered_map<char, char> rmap;
        unordered_set<char> lmap;
        
        for(int i = 0; i <= s.size() - 1; i++){
            if(rmap.find(s[i]) == rmap.end()){
                rmap.emplace(make_pair(s[i], t[i]));
                if(lmap.find(t[i]) != lmap.end()) return false;
                else if(lmap.find(t[i]) == lmap.end()){
                    lmap.insert(t[i]);
                }
            }
            else{
                if(rmap[s[i]] != t[i]) return false;
            }
        }
        return true;
    }
};