/*
 * Time Complexity : O(n)
 * Space Complexity : O(2n)
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : No


 ? Your code here along with comments explaining your approach
   I created 2 hashmaps to keep a track of the the letters from
   each word which maps to which and if there are any letters
   from either of the words that are being mapped to multiple
   values I return false.
*/

#include <string>
#include <unordered_map>

class Solution {
public:
    bool isIsomorphic(std::string s, std::string t) {
        std::unordered_map<char, char> mp_1, mp_2;

        for (int i = 0; i < s.size(); i++) {
            if (mp_1.contains(s[i]) && mp_1[s[i]] != t[i]) {
                return false;
            }
            if (mp_2.contains(t[i]) && mp_2[t[i]] != s[i]) {
                return false;
            }
            mp_1[s[i]] = t[i];
            mp_2[t[i]] = s[i];
        }

        return true;
    }
};