/* Problem 2: Isomorphic string
*/

// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Isomorphic strings are 1 to 1 mapping(replacing character) and it preserves the order
//There are four approaches to solve this problem: two HashMap, HashSet, Single HashMap and Character array
//Brute force: In hashmap, its preferred since we maintain key:value pairs and unique pairs. Its preffered over Linked List since its O(1) search space
//Approach 1: We can create two hashmaps S and T and keep S->T mapping(S) and T->S mapping(T), O(t) = O(1), O(s) = O(n)
//Approach 2: HashSet, O(t) = O(1), O(s) = O(n)
//Approach 3: Single Hashmap, but in this hashmap we have to maintain hash index on keys(O(1)) and values(O(n))
//Note: under the hood implementation of hashmap, its hash index on keys but not on values, so for above approach, O(t) = O(n)
//Now as we know in worst case, its a constant space(26 chars), we can use constant space data structure instead of hashmap
//Approach 4: lets use char array of 26 chars, O(t) = 1, O(s) = O(1)
//The 4th approach is the best approach since we will use ASCII codes
//ASCII Codes: and we know from 32 to 126 we have special chars(33-47), numbers(48-57), special chars(58-64), A-Z(65-90), a-z(97-122)
//we can estimate char array of 100

//Approach 4: creating char of array nodes
class Solution {
    public boolean isIsomorphic(String s, String t) {
        //edge case: if count of chars doesn't match, return false and its not isomorphic
        if(s.length() != t.length()) return false;
        //initialising two char of array nodes
        char[] sMap = new char[100];
        char[] tMap = new char[100];
        //traverse the string
        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            //If both sChar and tChar are not mapped , then map each other and proceed
            //since ASCII is valid characters
            if(sMap[sChar - ' '] == 0){
                sMap[sChar - ' '] = tChar;
            }
            else {
                if(sMap[sChar - ' '] != tChar) return false;
            }
            if(tMap[tChar - ' '] == 0){
                tMap[tChar - ' '] = sChar;
            }
            else {
                if(tMap[tChar - ' '] != sChar) return false;
            }
        }
        return true;
    }
}
//Approach 1: Creating two hashmap S and T
// class Solution {
//     public boolean isIsomorphic(String s, String t) {
//         //edge case: if count of chars doesn't match, return false and its not isomorphic
//         if(s.length() != t.length()) return false;
//         //initialising two hashmaps
//         HashMap<Character, Character> sHashMap = new HashMap<>();
//         HashMap<Character, Character> tHashMap = new HashMap<>();
//         //traverse the string s
//         for(int i = 0; i < s.length(); i++){
//             char sChar = s.charAt(i);
//             char tChar = t.charAt(i);
//             if(!sHashMap.containsKey(sChar)){
//                 //if s hashmap doesn't contain key, add it
//                 sHashMap.put(sChar, tChar);
//             }
//             else {
//                 if(sHashMap.get(sChar) != tChar) return false;
//             }
//             if(!tHashMap.containsKey(tChar)){
//                 //if t hashmap doesn't contain key, add it
//                 tHashMap.put(tChar, sChar);
//             }
//             else {
//                 if(tHashMap.get(tChar) != sChar) return false;
//             }
//         }
//         return true;
//     }
// }