// Time complexity: O(n * k * log(K)) where n is number of words in list and k is number of char in a word.
// Space Complexity: O(n) where n is the number of keys stores in the HashMap
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No
//
//
// Time complexity: O(n * k) n is each word and k is each char in the word
// Space Complexity: O(n) where n is the number of keys stores in the HashMap
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


class Solution {
//    fun groupAnagrams(strs: Array<String>): List<List<String>> {
//
//        val hashMap = HashMap<String, MutableList<String>>()
//
//        for(word in strs){
//            val charWord = word.toCharArray()
//            val sortedWord  = charWord.sorted().joinToString("")
//            if(hashMap.containsKey(sortedWord)){
//                hashMap[sortedWord].add(word)
//            }else{
//                hashMap[sortedWord]  = listOf(word)
//            }
//        }
//        val output = listOf()
//        for(values in hashMap.values){
//            output.add(values)
//        }
//
//        return output
//
//    }

    val primeNumbers = listOf(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
        101)
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val hashMap = HashMap<Double, MutableList<String>>()
        for(word in strs){
            val hashedWord  = hashWord(word)
            if(hashMap.containsKey(hashedWord)){
                hashMap[hashedWord]!!.add(word)
            }else{
                hashMap[hashedWord]  = mutableListOf(word)
            }
        }
        val output: MutableList<List<String>> = mutableListOf()
        for(values in hashMap.values){
            output.add(values)
        }

        return output
    }

    fun hashWord(word: String): Double{

        var hashedNumber:Double = 1.0
        for(char in word.toCharArray()){
            val charPrimeNumber = primeNumbers[char.toInt() - 'a'.toInt()]
            hashedNumber *= charPrimeNumber
        }

        return hashedNumber
    }

}