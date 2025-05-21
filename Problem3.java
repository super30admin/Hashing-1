// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : None


class Problem3 {
    public boolean wordPattern(String pattern, String s) {

        HashMap<Character, String> charToWord = new HashMap<>();
        HashSet<String> seenWords = new HashSet<>();

        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i].trim();
            
            if (charToWord.containsKey(ch)) {
                if (!charToWord.get(ch).equalsIgnoreCase(word)) return false;
            } else {
                if (seenWords.contains(word)) return false;
                charToWord.put(ch, word);
                seenWords.add(word);
            }
        }

        return true;
    }
}