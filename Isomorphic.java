/** LeetCode Execution: No Problem */

/**
 * Time Complexity: O(n): Running through the string. N -> Length of string
 * Space Complexity: O(n): For HashMap O(2n) & for HashSet O(n)
 */

class Solution {
  public boolean isIsomorphic(String s, String t) {
      
      HashMap<Character, Character> tracker = new HashMap<>();
      Set<Character> valTracker = new HashSet<>();
      
      for (int i = 0; i < s.length(); i++) {
          char key = s.charAt(i);
          char value = t.charAt(i);
          if(!tracker.containsKey(key)) {
              if (valTracker.contains(value)) {
                  return false;
              }
              valTracker.add(value);
              tracker.put(key, value);
          } else if (tracker.containsKey(key) && !(tracker.get(key) == value)) {
              return false;   
          } 
      }
      
      return true;
  }
}