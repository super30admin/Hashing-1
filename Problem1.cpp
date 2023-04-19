// ## Problem 1:
// Given an array of strings, group anagrams together.

// Example:
// Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
// Output:
// [
//   ["ate","eat","tea"],
//   ["nat","tan"],
//   ["bat"]
// ]

// Note:
// All inputs will be in lowercase.
// The order of your output does not matter.

// For this I am taking a map of string ,vector<string> and then sorting each string and checking 
// whether sortedstring key exists in the map ,if exists I will append the string to a vector of 
// that key ,else I will insert a new key in map.In such way at the end I will have all the anagrams grouped.

// In this approach time complexity for sorting is KlogK we can optimise this by replacing the
//  key of a map with prime product as the product of prime numbers is always unique,
// In this we assign each char with a unique prime number, and for string we will calculate the product of all
// chars and we can use this product as key in map

// TC: O(NKlogK) N-->size of vector;  K-->max size of each string
// SC: O(N)


class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {

        unordered_map<string,vector<string>>M;
        vector<vector<string>>ans;

        if(strs.size()==0) 
        return ans;
       
        for(int i=0;i<strs.size();i++)
        {
            string temp=strs[i];
            sort(temp.begin(),temp.end());
        
            if(M.find(temp)!= M.end())
            {
                M[temp].push_back(strs[i]);
            }
            else
            {
                vector<string>s;
                M.insert(make_pair(temp,s));
                M[temp].push_back(strs[i]);
            }
        }

        for(auto m:M)
        {
            ans.push_back(m.second);
        }
        return ans;
    }
};