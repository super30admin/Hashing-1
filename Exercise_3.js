// Time Complexity : O(n)
// Space Complexity : O(1) 
// Approach : creating two hash map and comparing the values


var isIsomorphic = function (s, t) {
    if (s == null || s.length == 0 || t == null || t.length == null) return false
    const hmap1 = {}
    const hmap2 = {}
    for (let i = 0; i < s.length; i++) {
        const key1 = s[i]
        const val1 = t.split(" ")
        if (!hmap1[key1]) {
            hmap1[key1] = val1[i]
        } else if (hmap1[key1] && hmap1[key1] != val1[i]) {
            return false
        }
        if (!hmap2[val1[i]]) {
            hmap2[val1[i]] = key1
        } else if (hmap2[val1[i]] && hmap2[val1[i]] != key1) {
            return false
        }
    }
    return true
};

