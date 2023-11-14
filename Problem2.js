// https://leetcode.com/problems/isomorphic-strings/
//tc is O(n) and sc is O(n) 
// Yes solved in LeetCode
/* */

/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isIsomorphic = function(s, t) {
    
    if(s.length!= t.length){
        return false;
    }

    let aM= {};
    let bM={};

    for(let i=0;i<s.length;i++){
        let a=s.charAt(i);
        let b=t.charAt(i);

        if(aM[a] !== bM[b]){
            return false;
        }
        aM[a]=i+1;
        bM[b]=i+1;
    }
return true;
};