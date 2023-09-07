class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length())
            return false; // Check if the number of characters in pattern matches the number of words

        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            // Mapping character to word
            if (!charToWord.containsKey(c))
                charToWord.put(c, word);

            // Mapping word to character
            if (!wordToChar.containsKey(word))
                wordToChar.put(word, c);

            // Check if the mappings are consistent
            if (!charToWord.get(c).equals(word) || !wordToChar.get(word).equals(c))
                return false;
        }

        return true; // Return true if all character-word mappings are consistent
    }
}

//Time Complexity: O(N)
//Space Complexity: O(N)
