// N is number of strings in the input array, k is the length of the string. 
//TimeComplexity: O(Nklogk)
//SpaceComplexity: O(N*k)
// In this problem, we need to group anagrams, solution involves sorting the str and using that as a key for the hashmap, all they strs with that key are stored in a list and then lisp is returned. 
class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = HashMap<String, MutableList<String>>()

        for (i in 0..strs.size - 1) {
            val curr = strs[i]
            val sortedStr = curr.toCharArray().apply { sort() }.concatToString()
          
            val list = map.getOrPut(sortedStr) { mutableListOf() }
            list.add(curr)

        }
        return map.values.toList()
    }
}