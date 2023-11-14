// https://leetcode.com/problems/group-anagrams/

//tc is n(klogk) and sc is o(n) 
// Yes solved in LeetCode
/*the provide string are split and sorted and that joined using the methods and 
compared the string to the keys in the map, if they already present grouped them else pushed
into the map*/


/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {
    
    const map={}

    for(const s of strs){
        const key=s.split('').sort().join('');
    if(map[key]){
        map[key].push(s);
    }
    else {
        map[key]=[s];
    }
    }
    return Object.values(map);
};

