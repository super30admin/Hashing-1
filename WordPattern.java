import java.util.HashMap;
import java.util.HashSet;
//Time Complexity - O(nk) where n is the length of pattern, and k is length of each word in given string (For Split up of string).
//the lookup in hashmap will also take nk times.
//Space Complexity - O(1) - because we have only 26 possible storage values for hashmap.
/*To match the character of pattern  with the string in given string we use a hashmap, and a hashset.
Hashmap will map the character with word. Hashset will maintain the splitted strings whether they have been mapped by hashmap or not.

* */
public class WordPattern {
    //https://leetcode.com/problems/word-pattern/

    public static void main(String[] args) {
        String pattern ="abba";
        String s ="dog cat cat fish";
        System.out.println(wordPattern(pattern,s));
    }
   /* public static boolean wordPattern(String pattern, String s) {
        String[] sArray= s.split(" ");
        if(pattern.length()!=sArray.length) return  false;
        HashMap<Character,String> map = new HashMap<>();
        HashMap<String,Character> sMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String str = sArray[i];
            if(map.containsKey(c)){
                if(!map.get(c).equals(str)) return false;
            }

            else map.put(c,str);
            if(sMap.containsKey(str)) {
                if (sMap.get(str) != c) return false;
            }

                else sMap.put(str,c);
            }


        return true;


    }*/
   public static boolean wordPattern(String pattern, String s){
       String[] sArray = s.split(" ");
       if(pattern.length()!= sArray.length) return false;
       HashMap<Character,String> map = new HashMap<>();
       HashSet<String> set = new HashSet<>();
       for (int i = 0; i < pattern.length(); i++) {
           char c = pattern.charAt(i);
           String str = sArray[i];
           if(map.containsKey(c)){
               if(!map.get(c).equals(str)) return false;
           }
           else{
               if(set.contains(str)) return false;
               set.add(str);
               map.put(c,str);
           }

       }
       return true;
   }
}
