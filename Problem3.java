// Time Complexity : O(S) + O(P) + O(K) K = Max length of a single word in S
// Space Complexity : O(S)
// Passed Leetcode

class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] s_array = s.split(" ");
        
        if (pattern.length() != s_array.length)
            return false;
        
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        
        for (int i = 0; i < pattern.length(); i++) {
            
            char curr = pattern.charAt(i);
            
            if (map.containsKey(curr)) {
                
                if (!map.get(curr).equals(s_array[i]))
                    return false;
                
            } else {
                if (set.contains(s_array[i]))
                    return false;
                map.put(curr, s_array[i]);
                set.add(s_array[i]);
            }
        }
                    
        return true;
    }
}