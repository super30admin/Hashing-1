/*
  Time Complexity: O(NKlogK), where N is the length of strs, 
  and K is the maximum length of a string in strs. 
  Space Complexity: O(NK), the total information content stored in mapString.
*/
/* Approach:
  1. Create a hashmap
  2. Convert each word of the string s into the character array
  3. Sort the character array
  4. The sorted character array is stored in the hashmap as the key and the 
  word of the string is stored as the corresponding value as a list  
  5. For the words having same characters as the key will map to the same key
  therefore they can be added to the  value list
  6. Then the hasmap values are returned which will have the anagrams grouped
  together in the form of a list
*/



class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mapString = new HashMap<>();
        for(String s: strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            
            String key = String.valueOf(charArray);
            mapString.putIfAbsent(key, new ArrayList<>());
            mapString.get(key).add(s);
        }
        return new ArrayList<>(mapString.values());
    }
}