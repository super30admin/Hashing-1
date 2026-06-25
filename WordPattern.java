// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Split the string into words and check if the pattern length matches the word count.
// Use two maps to enforce a one-to-one mapping: pattern character -> word and word -> pattern character.
// Return false if either direction has an inconsistent mapping; otherwise return true.

class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> map = new HashMap<>();
        Map<String, Character> reverseMap = new HashMap<>();

        for(int i = 0; i< pattern.length(); i++) {
            char letter = pattern.charAt(i);
            String word = words[i];

            if(map.containsKey(letter)) {
                if(!map.get(letter).equals(word)) {
                    return false;
                }
            }

            if(reverseMap.containsKey(word)) {
                if(reverseMap.get(word) != letter) {
                    return false;
                }
                continue;
            }

            map.put(letter, word);
            reverseMap.put(word, letter);
        }

        return true;
    }
}