# Time Complexity : O(1) where k = length of the longest string(s)
# Space Complexity : O(n * m) -> where n: number of letters in string s and m: number of letters in string t 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

// We will be mapping each isomorphically positioned letter in string s to the letter in string t and also storing the letter from string t in a set.

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        int n=s.size();
        map<char,char>mp;
        set<char>x;
        for(int i=0;i<n;i++){
            if(mp.count(s[i])==0 && x.count(t[i])==0){
                mp[s[i]]=t[i];
                x.insert(t[i]);
            }
            else if(mp.count(s[i])==0 && x.count(t[i]))
                return false;
            else if(mp[s[i]]!=t[i])
                return false;
        }
        return true;
    }
};