// Time Complexity : O(nk)
// Space Complexity : O(nk)
// Did this code successfully run on Leetcode : Yes

//using prime product
#include <iostream>
#include <vector>
#include <unordered_map>
  
using namespace std;


class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<double, vector<string>> anagramPair;

        vector<int> prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};

        for(const string& str: strs){
            double prime_product = 1;
            for(char c : str){
                int idx = c - 'a';
                prime_product *= prime[idx];
            }
            if(anagramPair.find(prime_product) == anagramPair.end()){
                anagramPair.insert(make_pair(prime_product, vector<string>{str}));
            }
            else{
                anagramPair[prime_product].push_back(str);
            }
        }
        vector<vector<string>> output;
        for(auto it = anagramPair.begin(); it != anagramPair.end(); it++){
            output.push_back(it -> second);
        } 
        return output; 
    }
};