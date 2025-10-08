// Time Complexity : n*l*logl
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

/*
 * Approach
 * idea here is to keep a hashset of the string but how do we check is they are anagram or not,
 * there are two ways of doing it, first would be to sort the string and compare or another way of 
 * doing it is assign unique primes to each char and then multilpy it and sum it so you get a unique hash,
 * and if a strign is a anagram you will get the same hash value 
 */

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String string : strs) {
            char[] str = string.toCharArray();
            Arrays.sort(str);
            String stringSorted = String.valueOf(str);
            if (!map.containsKey(stringSorted)) {
                map.put(stringSorted, new ArrayList<>());
            }
            map.get(stringSorted).add(string);
        }
        return new ArrayList<>(map.values());
    }
}