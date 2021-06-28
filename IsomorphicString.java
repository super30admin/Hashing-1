/*
  Time Complexity: O(N)
  Space Complexity: O(N)
*/

/* 
 Approach:
  1. Create the map for storing the key as the character in string s and 
  value as the character in string t
  2. Create the set for stroing the character from string t
  3. Put the character from the string s as the key and 
  character from the string t as the value in hashmap
  4. Add the chaarcter from the string t in set
  5. If the key (character from the string s) is in the map but its corresponding value
  does not match with the character in the string t then the strings are not isomorphic
  6. If the map does not contain the key which is character from the string s but set contains
  the character from the string t then the strings are not isomorphic
  7. If both the condition does not become true that means the strings are isomorphic
  
*/


class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for(int  i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i)) && 
               map.get(s.charAt(i)) != t.charAt(i)) return false;
            if(!map.containsKey(s.charAt(i)) && 
               set.contains(t.charAt(i))) return false;
            map.put(s.charAt(i), t.charAt(i));
            set.add(t.charAt(i));
        }
        return true;
    }
}