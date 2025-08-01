#include<iostream>
#include<bits/stdc++.h>
#include<vector>
using namespace std;
/*
Each string is hashed using a product of unique primes corresponding to each character.
Hashes serve as keys in a map to group anagrams together.
The result is a collection of string lists sharing the same hash
*/
class Solution{
public:
      vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<double, vector<string>> map;

        for (string str : strs) {
            double hash = getHash(str);
            map[hash].push_back(str);
        }

        vector<vector<string>> result;
        for (auto& pair : map) {
            result.push_back(pair.second);
        }

        return result;
    }

private:
    double getHash(string str) {
        int primes[26] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
                          41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};

        double hash = 1.0;
        for (char c : str) {
            hash *= primes[c - 'a'];
        }

        return hash;
    }
};
