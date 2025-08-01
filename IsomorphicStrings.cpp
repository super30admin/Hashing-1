#include<iostream>
#include<vector>
#include<unordered_map>
using namespace std;
/*
Use two hash maps to track mapping between characters of s and t.
At each index, ensure mapping is consistent both ways.
If any mismatch occurs, return false; otherwise, return true.
*/
class Solution{
public:
    bool isIsomorphic(string s, string t) {
        unordered_map<char,char> sTOtMap;
        unordered_map<char,char> tTOsMap;

        for(int i=0;i<s.length();i++){
            char sChar=s[i], tChar=t[i];
            if(sTOtMap.count(sChar)){
                if(sTOtMap[sChar]!=tChar) return false;
            }else sTOtMap[sChar]=tChar;

            if(tTOsMap.count(tChar)){
                if(tTOsMap[tChar]!=sChar) return false;
            }else tTOsMap[tChar]=sChar;
            

        }
        return true;
    }
};
