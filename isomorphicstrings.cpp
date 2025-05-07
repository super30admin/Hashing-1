
// Time Complexity : O(n) , n is length of string 
// Space Complexity : O(n) hashmap making for length of string
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach
class Solution {
public:
    bool isIsomorphic(string s, string t) {
        
        unordered_map<char,char>charmap;
        unordered_map<char,char>reversemap;
        
        if( s.size() != t.size()){
            return false;
        }
        
        for( int i=0; i<s.size(); i++){
            if( charmap.find( s[i]) == charmap.end() ){
                if( reversemap.find( t[i] ) != reversemap.end() && reversemap[t[i]] != s[i] ){
                    return false;
                } else {
                  charmap[s[i]] = t[i];
                  reversemap[t[i]] = s[i];
                }
            } else {
                char mapping = charmap[s[i]];
                if( t[i] != mapping ){
                    return false;
                }
            }
        }
        return true;        
    }
};
