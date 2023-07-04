import java.util.*;
class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a HashMap to store anagrams
        Map<String, List<String>> anagramMap = new HashMap<>();

        // Iterate over each string in the input array
        for (String str : strs) {
            // Sort the characters of the current string
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            // Add the sorted string to the anagram map
            if (!anagramMap.containsKey(sortedStr)) {
                // If the sorted string is not already in the map, add a new entry with an empty list
                anagramMap.put(sortedStr, new ArrayList<>());
            }
            // Add the original string to the list of anagrams for the sorted string
            anagramMap.get(sortedStr).add(str);
        }

        // Convert the values of the anagram map to a list of lists
        List<List<String>> result = new ArrayList<>(anagramMap.values());

        // Return the final result
        return result;
    }
}