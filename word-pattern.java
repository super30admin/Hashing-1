
// TimeComplexity: O(n) where n is length of the pattern
// SpceComplexity: O(n)
// Explanation: Split the string into words. If pattern length != number of words, return false. We use two HashMaps to maintain bijection. While iterating: If mapping exists, verify consistency. If not, create new mapping. If all checks pass, return true.
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        Map<Character, String> map1 = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();
        int m =  pattern.length();
        int n = words.length;
        if(m!=n) return false;
        for(int i=0; i<pattern.length(); i++) {
            char curr = pattern.charAt(i);
            String word = words[i];
            
            if(map1.containsKey(curr)) {
                if(!map1.get(curr).equals(word) ) {
                    return false;
                }
            } else{
                map1.put(curr, word);
            }
            if(map2.containsKey(word)) {
                if(map2.get(word) != curr) {
                    return false;
                }
            } else{
                map2.put(word, curr);
            }
        }
        return true;
        
    }
}