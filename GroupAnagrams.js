/*
* TC: O(nk)
* SC: O(1)
*
* Approach1:
* To do this we could first take the string and
* then we could sort each key and have the key as the sorted string
* and value as the array of those strings
*
* Approach 2:
* We could use prime numbers as the condition of product of prime numbers is always not equal to a prime number
* We could assign each alphabet to a prime number and  store in an array as the number based corresponding  index of alphabets
* we have key as the multiplied value of each string as key and value as all strings that correspond to that key
* */
/**
 * @param {string[]} strs
 * @return {string[][]}
 */
const getPrimeProduct = (str) => {
  let result = 1;
  const primeNumbers = [ 2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
    31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
    73, 79, 83, 89, 97, 101, 103];

  for (let i = 0; i < str.length; i++) {
    c = str.charCodeAt(i);
    result = result * primeNumbers[c - 'a'.charCodeAt(0)] ;
  }
  console.log(result);
  return result;

}

var groupAnagrams = function(strs) {
  if (!strs) return [];

  const sMap = {};

  for (let i = 0; i < strs.length; i++) {
    str = strs[i];
    const primeProduct = getPrimeProduct(str);

    if(!sMap[primeProduct]) {
      sMap[primeProduct] = [];
    }
    sMap[primeProduct].push(str);
  }
  return Object.values(sMap);

};

console.log(groupAnagrams(["eat","tea","tan","ate","nat","bat"]))