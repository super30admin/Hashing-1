// Time Complexity : O(n)
// Space Complexity : O(1) 
// Approach : creating two hash map and comparing the values


var isIsomorphic = function (s, t) {
    if (s == null || s.length == 0 || t == null || t.length == null || (s.length != t.length)) return false
    const hmap1 = {}
    const hmap2 = {}
    for (let i = 0; i < s.length; i++) {
        const key1 = s[i]
        const val1 = t[i]
        if (!hmap1[key1]) {
            hmap1[key1] = val1
        } else if (hmap1[key1] && hmap1[key1] != val1) {
            return false
        }
        if (!hmap2[val1]) {
            hmap2[val1] = key1
        } else if (hmap2[val1] && hmap2[val1] != key1) {
            return false
        }
    }
    return true
};