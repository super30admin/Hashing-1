// Time Complexity : O(N + M) where N is length of s and M is length of pattern
// Space Complexity : O(W), where W is the number of unique words in s
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
/* We use a hashmap and hashset here. We map character from pattern -> word. If on getting the key of map we see corresponding string word in s
   is not same as value, we know there are multiple mappings of same character from pattern to s and we return false. Similarly we use
   hashset to make sure all values in s are have unique mapping to pattern. If mapping is one-to-one in both, we return true.
*/

class Solution {
    public boolean wordPattern(String pattern, String s) {
        if(pattern == null || s == null)
            return false;
        
        String[] words = s.split(" ");

        if(pattern.length() != words.length)
            return false;
        
        Map<Character, String> pMap = new HashMap<>();
        Set<String> sSet = new HashSet<>();

        for(int i = 0; i < pattern.length(); ++i) {
            char c = pattern.charAt(i);

            if(pMap.containsKey(c)) {
                if(!(pMap.get(c).equals(words[i])))
                    return false;
            } else if(sSet.contains(words[i]))
                return false;
            else {
                pMap.put(c, words[i]);
                sSet.add(words[i]);
            }
        }
        return true;
    }
}