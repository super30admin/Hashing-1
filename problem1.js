// ## Problem 1:

// Time Complexity : O(n klog(k))
// Space Complexity : O(m k)
// Did this code successfully run on Leetcode : Yes

// Given an array of strings, group anagrams together.

// Example:
// Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
// Output:
// [
//   ["ate","eat","tea"],
//   ["nat","tan"],
//   ["bat"]
// ]

// Note:
// All inputs will be in lowercase.
// The order of your output does not matter.

var groupAnagrams = function(strs) { 
    const map = new Map();
    let res = [];
    for (let str of strs) {
        const key = str.split('').sort().join('');
        if (!map.has(key)) map.set(key, [])
        map.get(key).push(str);
    }
    for(let [k,v] of map) {
        res.push(v);
    }
    return res;
};