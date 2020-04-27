// ## Problem 2:

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes

// Given two strings s and t, determine if they are isomorphic.
// Two strings are isomorphic if the characters in s can be replaced to get t.
// All occurrences of a character must be replaced with another character while 
// preserving the order of characters. No two characters may map to the same character 
// but a character may map to itself.

// Example 1:
// Input: s = "egg", t = "add"
// Output: true

// Example 2:
// Input: s = "foo", t = "bar"
// Output: false

// Example 3:
// Input: s = "paper", t = "title"
// Output: true
// Note:
// You may assume both s and t have the same length.

let isIsomorphic = function(s, t) {
    var isIsomorphic = function(s, t) {
        if(s.length !== t.length) return false;
         let mapS = new Map(); mapT = new Map();
         for(let i = 0; i < s.length; i++) {
             if(mapS.has(s[i]) || mapT.has(t[i])) {
                 if(mapS.get(s[i]) !== t[i] || mapT.get(t[i]) !== s[i]) return false;
             }
             else {
                 mapS.set(s[i], t[i]);
                 mapT.set(t[i], s[i]);
             }
         }
         return true;
     };
}