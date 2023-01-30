class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split("\\s+");
        if(words.length != pattern.length()) {
            return false;
        }
        HashMap<String, Character> wordMap = new HashMap<>();
        HashMap<Character, String> patternMap = new HashMap<>();
        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            char c = pattern.charAt(i);
            if(wordMap.containsKey(word) && wordMap.get(word) != c) {
                return false;
            } else if(!wordMap.containsKey(word)) {
                wordMap.put(word, c);
            }
            if(patternMap.containsKey(c) && !patternMap.get(c).equals(word)) {
                return false;
            } else if(!patternMap.containsKey(c)) {
                patternMap.put(c, word);
            }
        }
        return true;
    }
}