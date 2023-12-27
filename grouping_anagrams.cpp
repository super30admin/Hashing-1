// Time Complexity : O(nk) -> n: number of strings and k-> prime product
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : no it is failing on one case.
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// For every string, we calculate prime product and store all same prime products to a map
// We return the values(vector of strings) together 

#include<vector>
#include<string>
#include<unordered_map>

// Method - 2

class Solution {
public:
    long double primeProduct(std::string s)
    {
        long double res = 1;
        for(char c:s)
        {
            res = res * primes[c - 'a'];
        }
        return res;
    }
    int primes[26] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
    std::vector<std::vector<std::string>> groupAnagrams(std::vector<std::string>& strs) {
        if (strs.empty())
        {
            return {{}};
        }

        std::unordered_map<long double, std::vector<std::string>> storage;
        std::vector<std::vector<std::string>> result;

        for(int i = 0; i< strs.size(); i++)
        {
            long double pProduct = primeProduct(strs[i]);
            storage[pProduct].push_back(strs[i]);
        }
        for(auto elem : storage)
        {
            result.push_back(elem.second);
        }
        return result;
    }
};