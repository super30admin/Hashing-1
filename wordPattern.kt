//TimeComplexity: O(n)
//SpaceComplexity: O(n)
// In this problem, we need to check if a string has a pattern. Solution involves using two hashmaps to store pattern to string mapping and string to pattern mapping. 
// While adding elements to the hashmap, we check if there is any breach and return false if there is any breach. If we reach end of the loop without any breaches, we return true.
    fun wordPattern(pattern: String, s: String): Boolean {
    
     val pMap = HashMap<Char, String>() 
     val sMap = HashMap<String, Char>() 
     val words = s.trim().split("\\s+".toRegex())

     if (pattern.length != words.size) return false

     for(i in 0.. pattern.length - 1) {
        val pChar = pattern[i]
        val sStr = words[i]
        if(pMap.containsKey(pChar)) {
            if(pMap.get(pChar) != sStr) {
                return false
            } 
        } else {
            pMap[pChar] = sStr
        }
         if(sMap.containsKey(sStr)) {
            if(sMap.get(sStr) != pChar) {
                return false
            } 
        } else {
            sMap[sStr] = pChar
        }
     }
     return true
    }
}