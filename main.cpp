#include <iostream>
#include <vector>
#include <map>
#include <algorithm>

using namespace std;

class Solution {
 // Time Complexity  --> O(n)
 // Space Complexity --> O(n)
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        map<string, vector<string>> m;
        vector<vector<string>> result;
        for(string s : strs){
            string temp = s;
            sort(temp.begin(),temp.end());
            m[temp].push_back(s);
        }
       for(auto x = m.begin(); x!= m.end(); x++){
           result.push_back(x->second);
       }
       return result;
    }
};