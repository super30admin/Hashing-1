// Time Complexity: O(n*k), where n is the number of words and k is the maximum length of a word.
// Space Complexity: O(n*k), where n is the number of words and k is the maximum length of a word.

// Approach: For each word, use a frequency array to count the occurrences of each character and generate a string based on these frequencies.
// Since anagrams have the same character frequencies, they will generate the same key in the HashMap.
// Group all words with the same key into a list and return all the lists stored in the HashMap.

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0){
            return new ArrayList<>();
        }
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            String temp = getHash(s);
            if(map.containsKey(temp)){
                map.get(temp).add(s);
            }else{
                map.put(temp, new ArrayList<>());
                map.get(temp).add(s);
            }
        }
        return new ArrayList<>(map.values());

        
    }
    public String getHash(String s){
        int[] freq = new int[256];
        char[] cArray = s.toCharArray();
        StringBuilder t = new StringBuilder("");
        for(char c : cArray){
            freq[c]++;
        }
        for(int i=0;i<256;i++){
            if(freq[i] > 0){
                t.append((char) i);
                t.append(freq[i]);
                t.append('#');
            }
        }
        return t.toString();
    }
}
