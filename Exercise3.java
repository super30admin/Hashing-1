class Solution {
    // I split the string into words and checked if the pattern length matches the number of words.
    // I used two hashmaps to maintain a bijetion - one mapaping pattern to words, other words to characters.
    // while iterating, I return false if any existing mapping mismatchedl otherwise stored the mapping return true at the end.

    public boolean wordPattern(String pattern, String s) {
        String[]words = s.split(" ");
        if(pattern.length() != words.length){
            return false;
        }
        HashMap<Character, String> mapPT = new HashMap<>();
        HashMap<String, Character>mapTP = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++){
            char ch = pattern.charAt(i);
            String word = words[i];
            if(mapPT.containsKey(ch) && !mapPT.get(ch).equals(word)){
                return false;

            }  
            if(mapTP.containsKey(word)&&!mapTP.get(word).equals(ch)) {
                return false;
            }   
            mapPT.put(ch, word);
            mapTP.put(word,ch);
             }
        return true;
        
    }
}
