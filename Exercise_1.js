// Time Complexity : O(m * n) m is number of words and n is character in string
// Space Complexity : O(m * n) 
// Approach : creating hash map with unique keys , key calculated using prime product of every character

var groupAnagrams = function (strs) {
    if (strs == null || strs.length == 0) return [[""]]
    const hmap1 = {}

    for (let i = 0; i < strs.length; i++) {
        //   const sorted = strs[i].split('').sort().join('')
        const sorted = primeProduct(strs[i])
        if (hmap1[sorted]) {
            hmap1[sorted].push(strs[i])
        } else {
            hmap1[sorted] = []
            hmap1[sorted].push(strs[i])
        }
    }
    return Object.values(hmap1)
};

function primeProduct(str) {
    const primeNumber = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103]
    let product = 1
    for (let i = 0; i < str.length; i++) {
        const c = str.charAt(i)
        product = product * primeNumber[c.charCodeAt(0) - 'a'.charCodeAt(0)]
    }
    return product
}