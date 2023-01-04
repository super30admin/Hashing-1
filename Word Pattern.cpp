// Time Complexity: O(n)
// Space complexity: O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
public:
    bool wordPattern(string pattern, string s) {
        // TC = O(n)
        // SC = O(2n) ~ O(n)
        unordered_map<char, int> p2i;
        unordered_map<string, int> s2i;
        istringstream in(s);
        int i = 0;
        int n = pattern.size();
        for(string word; in >> word; i++) {
            if(i == n || p2i[pattern[i]] != s2i[word]) return false;
            p2i[pattern[i]] = i + 1;
            s2i[word] = i + 1;
        }
        return i == n;
    }
};