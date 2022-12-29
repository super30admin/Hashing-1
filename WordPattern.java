// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split("\s");
        HashMap<Character, String> wordMap = new HashMap<>();
        HashMap<String, Character> patternMap = new HashMap<>();
        if (words.length != pattern.length())
            return false;
        for (int i = 0; i < pattern.length(); i++) {
            char patChar = pattern.charAt(i);
            String word = words[i];
            if (wordMap.containsKey(patChar)) {
                if (!word.equals(wordMap.get(patChar))) {
                    return false;
                }
            } else {
                wordMap.put(patChar, word);
            }

            if (patternMap.containsKey(word)) {
                if (patChar != patternMap.get(word)) {
                    return false;
                }
            } else {
                patternMap.put(word, patChar);
            }
        }
        return true;
    }
}