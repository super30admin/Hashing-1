//Time Complexity : O(n) where n is the length of input string
//Space Complexity : O(3n)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : Yes, I had to use 3rd map to save the pair of chars from 's' and 't'.

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        map<char, int> s_map, t_map;
        map<char, char> match;
        map<char, int>::iterator itr1, itr2;
        
        for(int i = 0; i < s.size(); i++){
            itr1 = s_map.find(s[i]);
            itr2 = t_map.find(t[i]);
            
            if(itr1 == s_map.end() && itr2 == t_map.end()){
                s_map.insert(make_pair(s[i], 1));
                t_map.insert(make_pair(t[i], 1));
                match.insert(make_pair(s[i], t[i]));
            }
            else if(itr1 != s_map.end() && itr2 != t_map.end()){
                if(match[s[i]] != t[i])
                    return false;
            }
            else
                return false;
        }
        return true;
    }
};
