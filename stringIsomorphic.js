/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isIsomorphic = function(s, t) {
    let mapS = {};
    let mapT = {};

    for(let i=0;i<s.length;i++) {
        //check for s => t
        if((s[i]) in mapS) {
            if(!(t[i] in mapT)){
                // corresponding value should be in T as well
                return false;
            }
            if(mapS[s[i]] !== t[i] || mapT[t[i]] !== s[i] ) {
                return false;
            }
        } else {

            // check if its mapped to somethin else
            if (t[i] in mapT) {
                return false;
            }

            // add values to 
            mapS[s[i]] = t[i];
            mapT[t[i]] = s[i];
        }
    }
    return true;
};