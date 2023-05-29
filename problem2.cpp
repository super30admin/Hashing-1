# Time Complexity : O(klogk) where k = length of the longest string(s)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

// 

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