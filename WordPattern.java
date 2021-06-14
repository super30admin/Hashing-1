import java.util.HashMap;

class WordPattern {
    public boolean wordPattern(String pattern, String s) {

        //Time complexity (O(n))
        //Space complexity O(1)
        String[] words = s.split(" ");

        if (pattern.length() != words.length) return false;

        HashMap<Character, String> charMap = new HashMap<>();
        HashMap<String, Character> wordMap = new HashMap<>();

        for (int i=0; i<words.length; i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (!charMap.containsKey(c)) {
                charMap.put(c, word);
            } else {
                if (!charMap.get(c).equals(word)) {
                    return false;
                }
            }

            if (!wordMap.containsKey(word)) {
                wordMap.put(word, c);
            } else {
                if (!wordMap.get(word).equals(c)) {
                    return false;
                }
            }
        }

        return true;

    }
}