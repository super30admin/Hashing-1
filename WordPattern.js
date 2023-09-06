/*
* TC: O(n) + O(nk) where n is the number of characters in string s and k is the avg number of characters in word string. We need to split it.
* SC: O(1)
*
* Approach 1: Two hash map similar to isomorphic string where  we have 1 map for pattern corresponding to string and the other vice versa.
* we check that if the value exist in the map we return false or if the key of the pattern corresponds to a diff string we return false
*
* Approach 2:
* Instead of the string map we could use a set where we store all the unique strings and if they aren't unique we return false;
*
* */

/**
 * @param {string} pattern
 * @param {string} s
 * @return {boolean}
 */
var wordPattern = function(pattern, s) {
  const sArray = s.split(' ');
  if (pattern.length !== sArray.length) return false;

  const patternMap = {};
  // const stringMap = {};
  const stringSet = new Set();

  for (let i = 0; i < pattern.length ; i++) {
    const char = pattern.charAt(i);
    const str = sArray[i];
    if (!patternMap[char]) {
      patternMap[char] = str;
      //Added for hashset
      if (stringSet.has(str)){
        return false
      }
      stringSet.add(str);
    } else {
      if (patternMap[char] !== str){
        return false
      }
    }

    // if (!stringMap[str]) {
    //     stringMap[str] = char;
    // } else {
    //     if (stringMap[str] !== char) {
    //         return false;
    //     }
    // }
  }
  return true;

};


console.log(wordPattern('abba', "dog constructor constructor dog"))