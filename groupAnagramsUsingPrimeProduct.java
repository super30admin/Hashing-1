// Time Complexity : O(n*m)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.*;

class groupAnagramsSolution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<Double, List<String> > map = new HashMap<>();
        
        for (String currString : strs) { 
            double hashkey = primeProductKey(currString);
            
            if(!map.containsKey(hashkey)) {
                map.put(hashkey, new ArrayList<>());
            }
            map.get(hashkey).add(currString);
        }
        return new ArrayList<>(map.values());
    }

    public static Double primeProductKey(String s) {
        int[] primes = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
    
        double key = 1.0;
    
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            key = key * primes[c - 'a'];
        }
    
        return key;  
    }

    public static void main(String[] args) {
        String[] strings = new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String> > result = new ArrayList<>();
        result = groupAnagrams(strings);
        System.out.print(result);
    }
 
}