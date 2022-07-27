// Time complexity: O(n + k ) where n is number of chars in pattern and k is number of words
// Space Complexity: O(n) since the words can be more than 26
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {

        var wordList = s.split(" ")

        val hashMap = HashMap<Char, String>()
        val hashMap2 = HashMap<String, Char>()

        if(wordList.size != pattern.length) return false

        for(i in 0..pattern.length -1){

            if(hashMap.containsKey(pattern[i])){
                if(wordList[i] != hashMap[pattern[i]]) return false
            }
            else{
                hashMap.put(pattern[i], wordList[i])
            }
        }

        for(i in 0..wordList.size -1){

            if(hashMap2.containsKey(wordList[i])){
                if(pattern[i] != hashMap2[wordList[i]]!!) return false
            }
            else{
                hashMap2.put(wordList[i], pattern[i])
            }
        }

        return true

    }
}