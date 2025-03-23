// Time Complexity : O(N) N is size of MAX string 
// Space Complexity : O(1)  
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : unable to figure duplicates 


// Your code here along with comments explaining your approach:
// 1. Create 2 maps to track if each element is assigned to unique char and vice-versa
// 2. If element already exist return false.

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if(s.size()!=t.size()){
            return false;
        }
        map<char,char> m,l;
        for(int i=0;i<s.size();i++){
            if(m[s[i]]!=NULL && m[s[i]]!=t[i]){
                return false;
            }
            if(l[t[i]]!=NULL && l[t[i]]!=s[i]){
                return false;
            }
            m[s[i]]=t[i];
            l[t[i]]=s[i];
        }
        return 1;
    }
};