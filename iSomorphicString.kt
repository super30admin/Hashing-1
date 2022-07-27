// Time complexity: O(n) where n is the number of chars in the string
// Space Complexity: O(1), since we have 26 alphabets, if we can create an dictionary for 26 letters as key.
// But I created as a dynamic dictionary. is there any other that I can do?
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {

        val sHashMap = HashMap<Char, Char>()
        val tHashMap = HashMap<Char, Char>()

        for (i in 0..s.length -1){

            if (sHashMap.containsKey(s[i])){
                if(sHashMap[s[i]] != t[i]){
                    return false
                }
            }
            else{
                sHashMap.put(s[i], t[i])
            }

        }


        for (i in 0..t.length -1){

            if (tHashMap.containsKey(t[i])){
                if(tHashMap[t[i]] != s[i]){
                    return false
                }
            }
            else{
                tHashMap.put(t[i], s[i])
            }

        }

        return true

    }
}