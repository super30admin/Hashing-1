/** LeetCode Execution: No Problems */

/**
 * N -> Length of pattern
 * Time Complexity: O(n)
 * Space Complexity: O(n); O(2n) -> For HashMap + O(n) -> For HashSet
 */

 /**
  * Pretty Similar to "Isomorphic String" Program
  */

class Solution {
  public boolean wordPattern(String pattern, String str) {
      
      HashMap<Character, String> tracker = new HashMap<>();
      HashSet<String> strTracker = new HashSet<>();
      
      String[] strArr = str.split(" ", 0);
      
      if (!(strArr.length == pattern.length())) {
          return false;
      }
      
      for (int i = 0; i <pattern.length(); i++) {
          char key = pattern.charAt(i);
          String val = strArr[i];
          
          if (!tracker.containsKey(key)) {
              if (strTracker.contains(val)) {
                  return false;
              }
              tracker.put(key, val);
              strTracker.add(val);
          } else if(! (tracker.get(key).equals(val))) {
              return false;
          }
          
      }
      
      return true;
      
  }
}