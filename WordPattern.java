public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> char_map = new HashMap<>();
        HashMap<String,Character> word_map = new HashMap<>();
        String[] words = s.split(" ");
        
        if(words.length!=pattern.length()){
            return false;
        }

        for(int i=0;i<words.length;i++){
            char ch = pattern.charAt(i);
            String word = words[i];

            if(!char_map.containsKey(ch)){
                if(word_map.containsKey(word)){
                    return false;
                }else{
                    char_map.put(ch,word);
                    word_map.put(word,ch);
                }
            }else{
                String mapped_word = char_map.get(ch);
                if(!mapped_word.equals(word)){
                    return false;
                }
            }
        }
        return true;
    }
}

// Time complexity - O(n+m) n-length of s , m-length of pattern
// Space complexity - O(w) w-number of unique words in s