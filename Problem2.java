//Problem 2:
//        Given two strings s and t, determine if they are isomorphic. Two strings are isomorphic if the characters in s can be replaced to get t. All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
//
//        Example 1: Input: s = "egg", t = "add" Output: true
//
//        Example 2: Input: s = "foo", t = "bar" Output: false
//
//        Example 3: Input: s = "paper", t = "title" Output: true Note: You may assume both s and t have the same length.


//Approach:
// By looking at the examples or the test cases of the problem. The main criteria for the string to be isomorphic is if
//characters have one to one correspondence. This can be achieved by maintaining two hashmaps.
//if the length of the two string are not equal. They are not isomorphic.
//iterate through any string and populate the hashmaps if the character is not present in the hashmaps.If in case it is present
//check the value for that key in the respective hashmaps must match with the current character in the string.If not they are not
//isomorphic. else at the end of the loop return true.

public class Problem2 {
}
