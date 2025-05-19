// ## Problem 2:
// Given two strings s and t, determine if they are isomorphic.
// Two strings are isomorphic if the characters in s can be replaced to get t.
// All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

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

//Did this code run on Leetcode : YES
//Did you face any problems : Was tying to solve it with single map fucntion but had to compromise on time

var isIsomorphic = function(s, t) {
    //TC - O(1s)
    //SC - O(N)
    //The size of the hashmap increases as the input size grows
let hashS = new Map()
let hashT = new Map()
s = s.split('')
t = t.split('')
if(t.length != s.length) return false
for(let i = 0;i<=s.length-1;i++){
    if(hashS.has(s[i]) || hashT.has(t[i])){
        if(hashS.get(s[i])!=t[i] || hashT.get(t[i]) != s[i]){
            return false
        }
    }
    else{
        hashS.set(s[i],t[i])
        hashT.set(t[i],s[i])
    }
}
return true
};