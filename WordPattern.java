
// TC-
//SC - 
//question - Given a pattern and a string str, find if str follows the same pattern. Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

import java.util.HashMap;
import java.util.HashSet;

class WordPattern{
    public static void main(String args[]){
        WordPattern wp = new WordPattern();

        String pattern = "abba", s = "dog cat cat dog";
        boolean result = wp.wordPattern(pattern, s);
        System.out.println(pattern + " and " + s + "are a match? " + result);

        String pattern1 = "abba", s1 = "dog cat cat fish";
        boolean result1 = wp.wordPattern(pattern1, s1);
        System.out.println(pattern1 + " and " + s1+ "are a match? " + result1);

        String pattern2 = "aaaa", s2 = "dog cat cat dog";
        boolean result2 = wp.wordPattern(pattern2, s2);
        System.out.println(pattern2 + " and " + s2 + "are a match? " + result2);

    }

    public boolean wordPattern(String pattern, String s) {

        HashMap<Character, String> map = new HashMap<>();
        String[] words = s.split(" ");
        HashSet<String> set = new HashSet<>();

        if(pattern.length() != words.length){
            return false;
        }

        for(int i=0; i<pattern.length(); i++){
            char p = pattern.charAt(i);
            if(!map.containsKey(p)){
                if(!set.contains(words[i])){
                    map.put(p, words[i]);
                    set.add(words[i]);
                }else{
                    return false;
                }
                
            }else{
                if(!map.get(p).equals(words[i])){
                    return false;
                }
            }
        }
    return true;
    
    }   

}