class WordPattern {
    public boolean wordPattern(String pattern, String s) {

        String[] str = s.split(" ");
        HashMap<Character, String> patternMap = new HashMap<>();
        HashMap<String, Character> wordMap = new HashMap<>();

        if(str.length != pattern.length()) return false;

        for(int i = 0; i < pattern.length(); i++) {
            char patternVal = pattern.charAt(i);
            if(patternMap.containsKey(patternVal)) {
                if(!patternMap.get(patternVal).equals(str[i])) return false;
            } else {
                patternMap.put(patternVal, str[i]);
            }

            if(wordMap.containsKey(str[i])) {
                if(!wordMap.get(str[i]).equals(patternVal)) return false;
            } else {
                wordMap.put(str[i], patternVal);
            }

        }
        return true;
    }
}