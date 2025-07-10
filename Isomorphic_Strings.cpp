#include<iostream>
#include<unordered_map>
using namespace std;
class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if(s.length()!=t.length())
            return false;
        unordered_map<char, char>s_hm;
        unordered_map<char, char>t_hm;
        for (int i = 0; i < s.length(); i++) {
            if (s_hm.count(s[i])) {
                if (s_hm[s[i]] != t[i]) 
                    return false;
            } 
            if (t_hm.count(t[i])) {
                if (t_hm[t[i]] != s[i]) 
                    return false;
            } 
            else{
                s_hm[s[i]] = t[i];
                t_hm[t[i]] = s[i];
            }
        }
        return true;
    }
};