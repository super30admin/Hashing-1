import java.util.*;
// Time Complexity: O(n * k), where n is the number of strings in the input array and k is the maximum length of a string
// Space Complexity: O(n), for storing the grouped anagrams in the hashmap
// Did this code successfully run on Leetcode: Yes
// Any problem you faced while coding this: Choosing a unique and collision-free way to identify anagrams efficiently

// Your code here along with comments explaining your approach:
// The goal is to group strings that are anagrams of each other.
// Instead of sorting each string (which is O(k log k)), we assign each character a unique prime number.
// For each string, we compute the product of the primes corresponding to its characters.
// Since anagrams will have the same characters (and thus the same prime product), we use this product as a hash key.
// We store all strings with the same hash in the same list in a hashmap.
// Finally, we return all the lists as the grouped anagrams.

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map to group words by their unique prime product hash
        HashMap<Double, List<String>> map = new HashMap<>();

        // Iterate over all strings in the input array
        for (int i = 0; i < strs.length; i++) {
            // Compute a hash based on product of primes for each string
            double hash = prime(strs[i]);

            // If the hash is not already present, create a new list; then add the string
            map.computeIfAbsent(hash, k -> new ArrayList<>()).add(strs[i]);
        }

        // Return all grouped anagram lists
        return new ArrayList<>(map.values());
    }

    // Helper method to calculate a unique hash for a string using prime multiplication
    public double prime(String strs) {
        // First 26 prime numbers corresponding to 'a' to 'z'
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
                41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83,
                89, 97, 101};

        // Initialize hash as 1 (neutral element for multiplication)
        double hash = 1;

        // For each character, multiply corresponding prime number
        for (char c : strs.toCharArray()) {
            hash = hash * primes[c - 'a'];
        }

        // Return the final product (used as hash key)
        return hash;
    }
    public static void main(String[] args) {
        GroupAnagrams solution = new GroupAnagrams();

        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = solution.groupAnagrams(input);

        // Print grouped anagrams
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
