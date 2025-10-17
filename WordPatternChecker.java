/*
Time complexity :O(n)
Space complexity: O(n)

Approach:
1) Split sentence into words and store in an Array
2) Traverse through the pattern and word Array and get corresponding character and the string at an index and map those in HashMap
    with key as character and value as word
2) To validate if there is only one to one character to word mapping is done we are storing the mapped words in a HashSet
 */
import java.util.HashMap;
import java.util.HashSet;

public class WordPatternChecker {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");
        // To store character to word mapping
        HashMap<Character, String> hashMap = new HashMap<>();
        // To store mapped words to ensure one to one mapping
        HashSet<String> hashSet = new HashSet<>();
        // If length of words and characters in the pattern doesn't match return false
        if(words.length != pattern.length()) return false;
        for(int i=0;i<words.length;i++){
            char ch = pattern.charAt(i);
            String str = words[i];
            // If the key is already there in the map
            if(hashMap.containsKey(ch)){
                // And mapped to different word, return false
                if (!(hashMap.get(ch)== str)) return false;
            }

            // If the key isn't there
            else{
                // But the word is already mapped to some other character from the pattern, return false
                if(hashSet.contains(str)) return false;
                // Else do the mapping and store the value in set
                else {
                    hashMap.put(ch,str);
                    hashSet.add(str);
                }
            }
        }
        return true;
    }
}
