/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {
    let mapper = {};
  
      // create a sorted string as key mapper and values as indexes of the anagram os sorted string
    for(let i=0;i<strs.length;i++) {
      const sortedS = strs[i].split('').sort().join('');
      if(sortedS in mapper) {
          mapper[sortedS].push(strs[i]);
      } else {
          mapper[sortedS] = [strs[i]]
      }
    }
  
      // create output array with the anagrams
      return Object.values(mapper)
  
  };