#include<iostream>
#include<vector>
#include<unordered_map>
using namespace std;
class Solution {
public:
    double hashval(string str) {
        int p[26] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        double val = 1.0;
        for (char c : str) {
            val *= p[c - 'a'];
        }
        return val;
    }
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<double, vector<string>> map;
        vector<vector<string>>ans;
        for (string str : strs) {
            double hash = hashval(str);
            map[hash].push_back(str);
        }
        for (auto& x : map) {
            ans.push_back(x.second);
        }
        return ans;
        
    }
};