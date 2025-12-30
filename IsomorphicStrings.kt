//TimeComplexity: O(n)
//SpaceComplexity: O(n)
// In this problem, we need to check if two strings are isomorphic. Solution involves using two hashmaps to store s to t mapping and t to s mapping. 
// While adding elements to the hashmap, we check if there is any breach and return false if there is any breach. If we reach end of the loop without any breaches, we return true.
class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {

     if(s.length != t.length) return false 

     val sMap = HashMap<Char, Char>() 
     val tMap = HashMap<Char, Char>() 

     for(i in 0.. s.length - 1) {
        val sChar = s[i]
        val tChar = t[i]

        if(sMap.containsKey(sChar)) {
            if(sMap.get(sChar) != tChar) {
                return false
            } 
        } else {
            sMap[sChar] = tChar
        }
         if(tMap.containsKey(tChar)) {
            if(tMap.get(tChar) != sChar) {
                return false
            } 
        } else {
            tMap[tChar] = sChar
        }
     }
     return true
    }
}