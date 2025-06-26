/*
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 * 
 * Approach 1: Using HashMap to group anagrams
 * - We can use a HashMap to group the anagrams.
 * - For each string, we can sort the characters and use the sorted string as a key in the map.
 * - The value will be a list of strings that are anagrams of each other.
 * - After processing all strings, we can return the values of the map as a list of lists. 
 * 
 * * * Time Complexity: O(N * K log K) where N is the number of strings and K is the maximum length of a string.
 * * * Space Complexity: O(N * K) for storing the anagrams in the map.
 * 
 * 
 * * Approach 2: Using Character Count as Key
 * * - Instead of sorting the string, we can count the occurrences of each character and use that as a key.
 * * - We can use an array of size 26 (for lowercase English letters) to count the occurrences of each character.
 * * - We can then convert the character count array to a string key and use it in the map.
 * * - This approach avoids the overhead of sorting and can be more efficient.
 * * * Time Complexity: O(N * K) where N is the number of strings and K is the maximum length of a string.
 * * * Space Complexity: O(N) for storing the anagrams in the map.
 * 
 * Approach 3: Using Prime Number Product as Key
 * - Each character can be assigned a unique prime number.
 * - The product of the prime numbers corresponding to the characters in a string can be used as a key.
 * - This approach also avoids the need for sorting or counting characters.
 * * * Time Complexity: O(N * K) where N is the number of strings and K is the maximum length of a string.
 * * * Space Complexity: O(N) for storing the anagrams in the map.
 * 
 */
public class GroupAnagrams {
    // Approach 1: Using HashMap to group anagrams
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        Map<String, List<String>> map = new HashMap<>();
        for(String str: strs)  {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray); // Sort the characters in the string
            String sortedStr = new String(charArray); // Create a new string from the sorted characters
            
            // If the sorted string is not in the map, add it with an empty list
            if(!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            // Add the original string to the list corresponding to the sorted string
            map.get(sortedStr).add(str);
        }
        // Return the values of the map as a list of lists
        return new ArrayList<>(map.values());
    }
    
    // Approach 2: Using Character Count as Key
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){ // Iterate through each string in the input array

            int[] charCount = new int[26]; // Initialize an array to store the count of each lowercase English letter

            for (char c : s.toCharArray()) { // Count the occurrences of each character in the current string
                charCount[c - 'a']++;
            }

            StringBuilder keyBuilder = new StringBuilder();
            for (int count : charCount) {// Construct a unique key for the current string based on its character counts
                // Append '#' followed by the count of each character to form the key
                keyBuilder.append('#').append(count);
            }

            String key = keyBuilder.toString();// Convert the StringBuilder to a String

            if (!map.containsKey(key)) { // If the map doesn't contain the key, initialize a new list for the key
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);// Add the current string to the list associated with the key in the hashmap
        }
        return new ArrayList<>(map.values());
    }

    // Approach 3: Using Prime Number Product as Key
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();
        
        Map<Double, List<String>> anagrams = new HashMap<>();
        for(String s : strs){
            double key = calculateKey(s);
            if(!anagrams.containsKey(key)){
                anagrams.put(key, new ArrayList<>());
            }
            anagrams.get(key).add(s);
        }
        return new ArrayList<>(anagrams.values());
    }
    
    private Double calculateKey(String s){
        int[] keyArr = {2, 3, 5, 7, 11 ,13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        double key = 1;
        for(char c: s.toCharArray()){
            key = key * keyArr[c - 'a'];
        }
        return key;
    }
}
