// Time Complexity :O(n), n= no. of words in string s
// Space Complexity :O(2n)=> O(n)
// Did this code successfully run on Leetcode : yes


class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        //converting 's' string to array of words
        String[] words = s.split(" ");
        //if the number of words and number of pattern doesn't match
        if(pattern.length() != words.length) return false;

        // map to store unique combination of pattern and word
        HashMap<Character, String> charToWord = new HashMap<>();
        // map to store unique combination of word and pattern
        HashMap<String, Character> wordToChar = new HashMap<>();
        //looping through all the words
        for(int i=0; i<words.length; i++){
            // current pattern
            char c = pattern.charAt(i);
            //if pattern not present
            if(!charToWord.containsKey(c)){
                //add to map
                charToWord.put(c,words[i]);
            }//if pattern present
            else{
                //check value of current pattern is same or not
                if(!charToWord.get(c).equals(words[i])){
                    //return false if value of current pattern is not same.
                    return false;
                }
            }
            //if word not present
            if(!wordToChar.containsKey(words[i])){
                // to map
                wordToChar.put(words[i], c);
            }// if word present
            else{  //check pattern corresponding to current word is same or not
                if(!wordToChar.get(words[i]).equals(c)){
                    //if not same
                    return false;
                }
            }
        }
        //if everything matches
        return true;
    }
}
