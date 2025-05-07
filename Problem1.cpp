// GROUPING ANAGRAMS   


// Time Complexity : O(n*k) where n is the length of the array and k is the length of the string
// Space Complexity : O(n) where n is the size of the hashmap.
// Did this code successfully run on Leetcode : Yes, it successfully ran on leetcode.
// Any problem you faced while coding this : I did run into hiccups but managed to successfully solve them.


// Your code here along with comments explaining your approach


#include<bits/stdc++.h>
using namespace std;


class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
    // creating a hashmap mapping the characters in string to prime numbers to calculate prime product
    vector<int> primeNum = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
    vector<char> charAl = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    unordered_map<char, int> m;
    
    for(int i=0; i<primeNum.size(); ++i)
    {
        m[charAl[i]] = primeNum[i]; // creating a hashmap mapping chars to prime nums
    }
   
    unordered_map<double, vector<string>> m2; // We will store value obtained by string in this hashmap so that we can grp words together.
    
    for(string s: strs)
    {
        double addString = 1;  // store the value obtained of string using primeproduct
        for(int i=0; i<s.length(); ++i)
        {
            addString *=m[s[i]];
        }
        m2[addString].push_back(s);
    }
     vector<vector<string>> v;
       for(auto element: m2)
       {
        v.push_back(element.second);
       }
       return v;
    }
};

// int main()
// {
//     return 0;
// }