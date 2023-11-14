// https://leetcode.com/problems/word-pattern/
//tc is O(m,n)  and sc is O(m,n). n is the length of s and m is the length of pattern 
// Yes solved in LeetCode
/**/
var wordPattern = function(pattern, s) {

    const word = s.split(" "); 
    
 if(pattern.length!= word.length){
        return false;
    }

    let patternMap= new Map();
    let uniqueSet= new Set();

    for(let i=0;i<pattern.length;i++){
        if(!patternMap.has(pattern[i])){
            if(uniqueSet.has(word[i])){
                return false;
            }
            patternMap.set(pattern[i], word[i])
            uniqueSet.add(word[i])
        }
        else{
            if(word[i]!== patternMap.get(pattern[i])){
                return false;
            }
        }
    }
    return true
    }