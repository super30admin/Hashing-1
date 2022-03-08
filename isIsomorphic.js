// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isIsomorphic = function (s, t) {
  const map = {};
  const mapT = {};
  for (let i = 0; i < s.length; i++) {
    const charS = s[i];
    const charT = t[i];
    if (map[charS]) {
      if (map[charS] !== charT) {
        return false;
      }
    } else {
      map[charS] = charT;
    }
    if (mapT[charT]) {
      if (mapT[charT] !== charS) {
        return false;
      }
    } else {
      mapT[charT] = charS;
    }
  }
  return true;
};
