/** LeetCode Execution: No Problems */

/** Solution 1 - Sorting + Hashing */

/**
 * N -> No of Strings, L -> Max Length of String
 * Time Complexity: N*L Log L; (L log L for Sorting), and we are sorting N Strings:
 * Space Complexity: O(N*L) -> Stoage cost of data stored.
 */
class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
      
      HashMap<String, List> result = new HashMap<String, List>();
      
      for (String s : strs) {
          char[] temp = s.toCharArray();
          Arrays.sort(temp);
          String key = String.valueOf(temp);
          
          if(!result.containsKey(key)) {
              result.put(key, new ArrayList());
          }
          result.get(key).add(s);
      }
      
      return new ArrayList(result.values());
  }
}


// Solution 2: Hashing : Cool Solution

/**
 * N -> No of Strings, L -> Max Length of String
 * Time Complexity: O(N*L)
 * Space Complexity: O(N*L) -> Stoage cost of data.
 */

class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
      
      int[] primeMapper = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
      
      HashMap<Integer, List> result = new HashMap<Integer, List>();
      
      for (String s : strs) {
          char[] temp = s.toCharArray();
          int key = 1;
          for (char c : temp) {
              key *= primeMapper[c - 'a'];
          }
          
          if(!result.containsKey(key)) {
              result.put(key, new ArrayList());
          }
          result.get(key).add(s);
      }
      
      return new ArrayList(result.values());
  }
}

