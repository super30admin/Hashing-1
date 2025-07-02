//Time Complexity : O(n)
// Space Complexity : O(n) : space used for the map to store anagrams
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Three line explanation of solution in plain english:
// 1. We use a prime number product to uniquely identify anagrams by calculating the product of prime numbers corresponding to each character in the string.
// 2. We store the strings in a map where the key is the product of primes
//   and the value is a list of strings that are anagrams of each other.
// 3. We return the values of the map as a list of lists containing grouped anagrams.
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // If the input array is null or empty, return an empty list
        if(strs == null || strs.length == 0) return new ArrayList<>();

        // Create a map to store the product of primes as keys and lists of anagrams as values
        HashMap <Double, List<String>> map = new HashMap<>();

        // Iterate through each string in the input array
        // Calculate the product of primes for each string and store it in the map
        for(String s: strs){
            double key = calculatedP(s);
            // If the key is not already in the map, create a new list for it
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        // Return the values of the map as a list of lists containing grouped anagrams
        return new ArrayList<>(map.values());
    }
    

    // Helper method to calculate the product of primes for a given string
    private double calculatedP(String s){
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
        double mult = 1;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            // Calculate the product of primes corresponding to each character
            mult = mult*(primes[c - 'a']);
        }

        return mult;

    }

}