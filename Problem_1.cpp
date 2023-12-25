/*
 * Time Complexity : O(n)
 * Space Complexity : O(n)
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : No


 ? Your code here along with comments explaining your approach
   I created a hashmap to keep track of the anagrams that I am
   grouping together. I sort the string values first and then
   use then as keys. This allows me to get find the words which
   are anagrams and then I add it to a list and run a for loop
   at the end to get all the grouped anagrams as result.
*/

#include <vector>
#include <string>
#include <unordered_map>

class Solution {
public:
    std::vector<std::vector<std::string>> groupAnagrams(std::vector<std::string>& strs) {
        std::unordered_map<std::string, std::vector<std::string>> map;

        for (const std::string& s : strs) {
            std::string key = s;
            sort(key.begin(), key.end());
            map[key].push_back(s);
        }

        std::vector<std::vector<std::string>> result;
        for (auto &pair : map) {
            result.push_back(pair.second);
        }

        return result;
    }
};