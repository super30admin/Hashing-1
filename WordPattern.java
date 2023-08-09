// Time Complexity : O(N)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class WordPattern {

    public static boolean wordPatternHashMap(String pattern, String s) {
        if (pattern == null && s== null) return true;
        if (pattern == null || s== null) return false;
        HashMap<Character,String> pmap = new HashMap<>();
        HashMap<String,Character> smap = new HashMap<>();

        String[] strs = s.split(" ");


        if(strs.length!=pattern.length()) return false;
        for(int i=0;i<pattern.length();i++){
            char pChar = pattern.charAt(i);
            String str= strs[i];
            
            if(pmap.containsKey(pChar)){
                if(!pmap.get(pChar).equals(str)) { 
                    return false;
                    
                }     
            }
            else{
                pmap.put(pChar,str);
            }
          
            if(smap.containsKey(str)){
                if(!smap.get(str).equals(pChar)){
                    return false;
                }
            }
            else{
                smap.put(str,pChar);
                }            
        }
        return true;
    }


 
    public static boolean wordPatternSet(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length() != words.length) return false;
        HashMap<Character, String> map = new HashMap<>();
        Set<String> wordSet = new HashSet<>();

        for(int i = 0; i < words.length; i++){
            if(!map.containsKey(pattern.charAt(i))){
                if(wordSet.contains(words[i])) return false;
                map.put(pattern.charAt(i), words[i]);
                wordSet.add(words[i]);
            }else{
                if(!map.get(pattern.charAt(i)).equals(words[i])){
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPatternHashMap(pattern,s));
        System.out.println(wordPatternSet(pattern,s));
    }
}

    

