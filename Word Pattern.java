class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        Map<Character, String> charToStringMapping = new HashMap<>();
        Map<String, Character> stringToCharMapping = new HashMap<>();
        
        if(pattern.length() != words.length) {
            return false;
        }
        
        for(int i = 0 ; i < pattern.length() ; i++) {
            if((charToStringMapping.containsKey(pattern.charAt(i)) ^ stringToCharMapping.containsKey(words[i])) || (charToStringMapping.containsKey(pattern.charAt(i)) && !(charToStringMapping.get(pattern.charAt(i)).equals(words[i]))) || (stringToCharMapping.containsKey(words[i]) && (stringToCharMapping.get(words[i]) != pattern.charAt(i)))) {
                return false;
            }
            
            charToStringMapping.putIfAbsent(pattern.charAt(i), words[i]);
            stringToCharMapping.putIfAbsent(words[i], pattern.charAt(i));
        }
        
        return true;
        
    }
}
