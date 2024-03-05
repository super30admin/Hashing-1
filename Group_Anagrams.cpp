// Time Complexity : O(n * k * log k)
//                     O(n) because we are iterating through each element
//                     O(k * log K) for sorting on each string element; avg k is lenght of each string
// Space Complexity : n * k
//                    n is number of elements and k is average size of string
//                    We should consider character length for string problems.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : 

/*
Leetcode : https://leetcode.com/problems/group-anagrams/
Given an array of strings strs, group the anagrams together. You can return the answer in any order.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:

Input: strs = [""]
Output: [[""]]
Example 3:

Input: strs = ["a"]
Output: [["a"]]

*/

/*
Approach one : Using hashmap
Each string element is sorted using in built sort function for string.
This sorted string is used as a key and string element is stored as a value in hashmap.

Everytime, there is collision i.e. multiple values present for same key; we will push the
element in the vector which is maintained as a value.
*/

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>> result;
        if (strs.empty()) return result;
        std::unordered_map<string,std::vector<string>>sMap;

        for (auto i : strs){                // O(N) 
            string sorted = i;
            sort(sorted.begin(), sorted.end());   // O(k*log k) for sorting; K is average size of each string
            sMap[sorted].push_back(i);
        }
        
        for (const auto& pair : sMap) {
            result.push_back(pair.second);
        }
    return result;
    }
};


/*
Approach one : Using hashmap

Instead of using sorted string for For hashing key, we can use product of prime numnbers
which can give better hashing function. 
Each character of string is iterated and prime number associated with each character is
taken from predefined array primes.
Product of all characters is used as key and strings are stored as a value in vector.

// Time Complexity : O(n * K)
//                   ... O(n) because we are iterating through each element
//                   ... O(k) as we are ierating through each character on each string element; avg k is lenght of each string
// Space Complexity : n * k

*/

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>>result;
        if(strs.empty()) return result;
        int primes[26] = {
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
            31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
            73, 79, 83, 89, 97, 101 };
        unordered_map<double, vector<string>>sMap;
        
        for (auto str : strs){
            double product = 1;
            for (auto ch : str) {
                product = product * primes[ch - 'a'];
            }
            sMap[product].push_back(str);
        }

        for (auto &pair : sMap){
            result.push_back(pair.second);
        }
            
        return result;
        }
};




