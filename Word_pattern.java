import java.util.*;
class Word_pattern {
    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> word_map = new HashMap<>();
        HashMap<String,Character> word_map2 = new HashMap<>();
        char[] pat = pattern.toCharArray();
        String[] string_to_match = s.split(" ");
        if(pat.length!=string_to_match.length){
            return false;
        }
        for(int i=0;i< pat.length;i++){
            char pat_char = pat[i];
            String each_str = string_to_match[i];
            if(!word_map.containsKey(pat_char)){
                word_map.put(pat_char,each_str);
            }
            else{
                if(!word_map.get(pat_char).equals(each_str)){
                    return false;
                }
            }
        }

        for(int i=0;i<string_to_match.length;i++){
            char pat_char = pat[i];
            String each_str = string_to_match[i];
            if(!word_map2.containsKey(each_str)){
                word_map2.put(each_str,pat_char);
            }
            else{
                if(!(word_map2.get(each_str)==(pat_char))){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Word_pattern.wordPattern("abba","dog dog dog dog"));
    }
}