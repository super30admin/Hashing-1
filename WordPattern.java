/* 
Time complexity : O(N) where N represents the number of words in the s or 
                  the number of characters in the pattern.
Space complexity : O(M) where M is the number of unique characters in pattern and words in s.
*/

/*
 Approach:
  1. Create a hashmap
  2. Split the string s to get every word of it
  3. If the length of the pattern and the string are not equal then pattern cannot be matched
  4. If equal
    i. Put the character of string pattern into the hashmap with the count value
    ii. Put the word of the  string s into the hashmap corresponding to the pattern
        with the same value as that of the value of the character pattern in hashmap
    iii. If the character and the word are representing the same value then the pattern 
         is matched.
*/


class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap commonValue = new HashMap<>();
        String[] words = s.split(" ");
        if(words.length != pattern.length()) return false;
        
        for(Integer i = 0; i < words.length ; i++){
            char ch = pattern.charAt(i);
            String word = words[i];
            if(!commonValue.containsKey(ch)){
                commonValue.put(ch, i);
            }
             if(!commonValue.containsKey(word)){
                commonValue.put(word, i);
            }
            if(commonValue.get(ch) != commonValue.get(word)) return false;
        }
        return true;
    }
}