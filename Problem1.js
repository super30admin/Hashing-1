// ## Problem 1:
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

//Did this code run on Leetcode : YES
//Did you face any problems : None

var groupAnagrams = function(strs) {
    //
    let hashMap = new Map()
    let res = []
    for(let i=0;i<strs.length;i++){
        //Char Array
        let charArray = new Array(26).fill(0)
        let OGString = strs[i]
        // let sortedString = OGString.split('').sort().join('')
        for(let i =0 ;i<OGString.length;i++){
            charArray[OGString.charCodeAt(i)-"a".charCodeAt(0)]++
        }
        let key = charArray.join("#") //COnvert the hash into a string for comparision
        if(hashMap.has(key)){
            hashMap.get(key).push(OGString)
        }
        else{
            hashMap.set(key,[OGString])
        }
    }
    for (let [key, value] of hashMap.entries()) {
        res.push(value)
    }
    return res 
};