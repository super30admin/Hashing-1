Problem 3: (https://leetcode.com/problems/find-peak-element/) (Last class problem)

// Time Complexity - O(log n) because in each iteration, the search range is reduced by half hence algorithm is logarithmic.
// Space Complexity - O(1) because it uses a constant amount of extra space. 

class Solution {
    public int findPeakElement(int[] nums) {
        if (nums == null || nums.length == 0) {                          // base case
            return -1;
        }
        int low = 0;                                                       // lower bound
        int high = nums.length - 1;                                        // higher bound

        while (low <= high) {                                                
            int mid = low + (high - low) / 2;                              // since low <= high find mid and this way prevents integer overflowing
            if ((mid == 0 || nums[mid] > nums[mid - 1]) && (mid == nums.length - 1 || nums[mid] > nums[mid + 1])) {       // Checking on the neighbour elements
                return mid;                                            // return index
            } 
            else if (nums[mid + 1] > nums[mid]) {                       // check if the right side is here
                 low = mid + 1;                                         // if higher move right
            }
            else {
                high = mid - 1;                                        // otherwise move left 
            }
        }
        return -1;                                                    // if you are not returning the index or the mid return anything
    }
}

## Problem 2: (https://leetcode.com/problems/isomorphic-strings/) (Hashing 1 Assignment)

// Time Complexity - O(n) because it iterates through each character of the given strings s and t only once
// Space Complexity - O(n) because in the worst case scenario, where each character of s and t are unique, the hashmaps will store n key-value pairs


// Issue faced - in the class space complexity was mentioned O(1) but according to my understanding I could only think of O(n) as the space complexity. Need to understand why it is O(1). Although professor did explain it but somehow I am not able to get it 


// 1st approach using 2 Hashmaps

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {                                   // Base Case
            return false;
        }
        // Using two hasmap
        HashMap<Character, Character> s_hashmap = new HashMap<>();         // First Hashmap
        HashMap<Character, Character> t_hashmap = new HashMap<>();         // Second Hashmap

        for (int i = 0; i < s.length(); i++) {                             // initializing loop to go through s.length() or t.length() as both are same
            char sChar = s.charAt(i);                                      // get character in 's'
            char tChar = t.charAt(i);                                      // get character in 't'

            if (s_hashmap.containsKey(sChar)) {                            // Check if the 'sHashMap' conatins the character
                if (s_hashmap.get(sChar) != tChar) {                       // Checking if the character is not mapped return false
                    return false;
                }
            }
            else {
                s_hashmap.put(sChar, tChar);                                // If the 'sHashMap' does not contain the character we will add it in the map
            }
            if (t_hashmap.containsKey(tChar)) {                             // Check if the 'tHashMap' conatins the character
                if (t_hashmap.get(tChar) != sChar) {                        // Checking if the character is not mapped return false
                    return false;
                }
            }
            else {
                t_hashmap.put(tChar, sChar);                                // If the 'sHashMap' does not contain the character we will add it in the map
            }
        }
        return true;                                                        // if the duplication of character never takes place return true
    }
}


// 2nd Approach by using 1 hashmap and 1 hashset

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        // Using one hasmap and one hashset
        HashMap<Character, Character> s_hashmap = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (s_hashmap.containsKey(sChar)) {
                if (s_hashmap.get(sChar) != tChar) {
                    return false;
                }
            }
            else {
                if (set.contains(tChar)) {                                // if my set already contains the character return false otherwise it can update the existing pair
                    return false;
                }
                set.add(tChar);                                     // if set does not contain the character add the character in the set
                s_hashmap.put(sChar, tChar);                        // and also add it in the Hashmap
            }
        }
        return true;
    }
}