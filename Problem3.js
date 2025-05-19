// ## Problem 3:
// Given a pattern and a string str, find if str follows the same pattern.
// Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

// Example 1:
// Input: pattern = "abba", str = "dog cat cat dog"
// Output: true

// Example 2:
// Input:pattern = "abba", str = "dog cat cat fish"
// Output: false

// Example 3:
// Input: pattern = "aaaa", str = "dog cat cat dog"
// Output: false

// Example 4:
// Input: pattern = "abba", str = "dog dog dog dog"
// Output: false
// Notes:
// You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.

//Did this code run on Leetcode : YES
//Did you face any problems : Was tying to solve it with single map fucntion but had to compromise on time
var wordPattern = function(pattern, s) {
    //TC - O(1s)
    //SC - O(N)
    //The size of the hashmap increases as the input size grows
    let map1 = new Map()
    let map2 = new Map()
    //Split basically converts the string into array where there is seperation
    s = s.split(" ")
    if(s.length != pattern.length) return false //Early Exit
    for(let i=0;i<=pattern.length-1;i++){
        let char = pattern[i]
        let word = s[i]
        //Compare do we have values
        if(map1.has(char) || map2.has(word)){
            //check if bijection mapping present or not
            if(map1.get(char)!== word || map2.get(word)!==char){
                return false
            }
            else{
                continue
            }
        }
        //If not present INSERT into set
        else{
            map1.set(char,word)
            map2.set(word,char)
        }
    }
    return true
};