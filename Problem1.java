//Problem 1:
//        Given an array of strings, group anagrams together.
//
//        Example: Input: ["eat", "tea", "tan", "ate", "nat", "bat"], Output: [ ["ate","eat","tea"], ["nat","tan"], ["bat"] ]
//
//        Note: All inputs will be in lowercase. The order of your output does not matter.

// Approach:
// Create a hashmap and populate it by iterating over the input array by key value pair . where key is the sorted version of the
// given string and the values are the permutations of the key string determined by sorting the string and if it matches the sorted
//key then it is appended to the arraylist. Finally iterate over the values of the hashmap and return the result.
//
public class Problem1 {
}
