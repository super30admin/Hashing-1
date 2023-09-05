/*
* TC: O(n)
* SC: O(1)
*
* Approach:
* We have to consider two maps to solve this if we consider one the possibility of
* when strings are interchanged we may not have isomorphic string e.g s=foo t=bar;
*
* We go through the string and then check if the character of S exist in the S Map if it doesn't we add to the map
* if it does then we check if the value of S Map  sMap[s[i]] is not equal to the t String at that character to rerun false if they deont
*
* We do a similar in the second T Map as well but now we consider string 2 with map to string 1 and follow the same process,
* if it never returned trued, then we return false
* */

/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isIsomorphic = function(s, t) {
  if (s.length !== t.length) return false;
  const sMap = {};
  const tMap = {};

  for (let i = 0; i< s.length; i++) {
    if (!sMap[s[i]]) {
      sMap[s[i]] = t[i];
    } else {
      if (sMap[s[i]] !== t[i]) {
        return false;
      }
    }
    if (!tMap[t[i]]) {
      tMap[t[i]] = s[i]
    } else {
      if (tMap[t[i]] !== s[i]) {
        return false;
      }
    }
  }
  return true;
};