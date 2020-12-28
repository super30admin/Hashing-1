// Time Complexity : O(NK) K = Max Length of the word
// Space Complexity : O(N)
// Passed Leetcode

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            int[] wordCount = new int[27];
            
            if (s.length() == 0)
                wordCount[26]++;
            
            for (int i = 0; i < s.length(); i++) {
                wordCount[s.charAt(i) - 'a'] ++;
            }
            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i <= 26; i++) {
                sb.append('#');
                sb.append(wordCount[i]);
            }
            String key = sb.toString();
            
            
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(s);

            
        }
        
        return new ArrayList(map.values());
        
        
    }
}