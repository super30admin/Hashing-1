#include <iostream>
#include <vector>
#include <map>
#include <algorithm>

using namespace std;
// Time Complexity  --> O(n)
// Space Complexity --> O(n)

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        map<char,char> m1;
        map<char,char> m2;
        for(int i =0; i< s.size();i++){
            if(m1.find(s[i]) != m1.end()){
                if(m1.find(s[i])->second != t[i]){
                    return false;
                }
            }else{
                m1[s[i]] = t[i];
            }
            if(m2.find(t[i]) != m2.end()){
                if(m2.find(t[i])->second != s[i]){
                    return false;
                }
            }else{
                m2[t[i]] = s[i];
            }
        }
        return true;
    }
};