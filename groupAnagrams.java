// Time Complexity : o(N) but considering the sorting of the chars in strings it would 
//O(n + mlogm)
// Space Complexity :o(N)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO
//https://github.com/PremAmanchi/Hashing-1

//For solving this problem, i sorted every character in the string and got the key word for the 
//group of anagrams, and then likewise grouped all the anagram pairs
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> pairs = new HashMap<>();
        for (String str : strs) {
            char[] letters = str.toCharArray();
            Arrays.sort(letters);
            String key = String.valueOf(letters);
            if (!pairs.containsKey(key))
                pairs.put(key, new ArrayList<>());
            pairs.get(key).add(str);
        }
        return new ArrayList<>(pairs.values());
    }
}
