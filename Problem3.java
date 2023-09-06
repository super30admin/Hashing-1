
//Problem 3:
//        Given a pattern and a string str, find if str follows the same pattern. Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
//
//        Example 1: Input: pattern = "abba", str = "dog cat cat dog" Output: true
//
//        Example 2: Input:pattern = "abba", str = "dog cat cat fish" Output: false
//
//        Example 3: Input: pattern = "aaaa", str = "dog cat cat dog" Output: false
//
//        Example 4: Input: pattern = "abba", str = "dog dog dog dog" Output: false Notes: You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.
//

//Approach :
// This is kind of similar to the previous problem which require one to one correspondence.
//iterate through any string and populate the hashmaps if the character is not present in the hashmaps.If in case it is present
//check the value for that key in the respective hashmaps must match with the current character in the string.If not they are not
//following the same pattern. else at the end of the loop return true.

public class Problem3 {
}
