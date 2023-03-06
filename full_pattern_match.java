import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

// Time Complexity: O(n); n = pattern.length()
// Space Complexity: O(n); one for hashmap another for hashset.
// Did this code run on leetcode? : Yes, on leetcode playground with the given test cases.
class Solution {
    public static void main(String[] args) {
        System.out.println(isFullMatch("abba", "dog cat cat dog"));
        System.out.println(isFullMatch("abba", "dog cat cat fish"));
        System.out.println(isFullMatch("aaaa", "dog cat cat dog"));
        System.out.println(isFullMatch("abba", "dog dog dog dog"));
    }
    
    public static boolean isFullMatch(String pattern, String s) {
        if (s == null || s.length() == 0 || pattern == null || pattern.length() == 0) {
            return false;
        }

        String[] arr = s.split(" ");
        if(pattern.length() != arr.length) {
            return false;
        }

        Map<Character,String> map = new HashMap<>();
        Set<String> seen = new HashSet<>();
        
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(pattern.charAt(i))) {
                if(!map.get(pattern.charAt(i)).equals(arr[i])) {
                    return false;
                } else {
                    continue;
                }
            }
            
            if(seen.contains(arr[i])) {
                return false;
            }
            
            map.put(pattern.charAt(i), arr[i]);
            seen.add(arr[i]);
        }

        return true;
    }
}