// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

/**
 * @param {string} pattern
 * @param {string} s
 * @return {boolean}
 */
var wordPattern = function (pattern, s) {
  const mapLetter = {};
  const mapWord = {};
  let wordsArray = s.split(" ");
  if (pattern.length !== wordsArray.length) return false;
  for (let i = 0; i < pattern.length; i++) {
    const charP = pattern[i];
    const wordS = wordsArray[i];
    if (mapLetter[charP]) {
      if (mapLetter[charP] !== wordS) return false;
    } else {
      mapLetter[charP] = wordS;
    }
    if (mapWord[wordS]) {
      if (mapWord[wordS] !== charP) return false;
    } else {
      mapWord[wordS] = charP;
    }
  }
  return true;
};
