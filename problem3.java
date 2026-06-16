
// approach: Use a HashMap to store the mapping of characters in the pattern to words in the string. Iterate through the pattern and the words simultaneously, and check if the mapping is consistent. If it is not, return false. If we successfully iterate through the pattern and the words, return true.
    public static boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = words[i];
            if (map.containsKey(c)) {
                if (!map.get(c).equals(w)) {
                    return false;
                }
            } else {
                if (map.containsValue(w)) {
                    return false;
                }
                map.put(c, w);
            }
        }
        return true;
    }
    
}
