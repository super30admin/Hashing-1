/**
 * @param {string} pattern
 * @param {string} s
 * @return {boolean}
 */
var wordPattern = function(pattern, s) {
    let sArr = s.split(' ');
    if(sArr.length !== pattern.length) {
        return false
    }
    console.log(sArr)
    let patternMapper = new Map();
    let sMapper = new Map();

    for(let i=0;i<pattern.length;i++ ){
        
        if(patternMapper.has(pattern[i]) ) {
            if(!(sMapper.has(sArr[i]))) {
                return false;
            }

            if(patternMapper.get(pattern[i]) !== sArr[i] || sMapper.get(sArr[i]) !== pattern[i]) {
                // not equal both ways - so not isomorphic
                return false;
            }
        } else {
            // check if other way exist already
            if(sMapper.has(sArr[i])) {
                // since pattern was not there in mapper - s should not be there as well
                return false;
            }

            // enter
            sMapper.set(sArr[i], pattern[i]);
            patternMapper.set(pattern[i], sArr[i]);
        }
    }
    return true
};