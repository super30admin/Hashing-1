//Time Complexity : O(n)
// Space Complexity : O(1) - As we have maximum 26 characters. Please help with this.
// Challenges : None
// Does it run on Leet Code? : Yes

// This is hashset, hashmap solution. Both are hashing functions based.
// If String is already being mapped to something else before and available in Set and not there in Map then it is wrong.


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern {
    class Solution {
        public boolean wordPattern(String pattern, String s) {
            if(pattern == null && s == null ) return true;
            if( s == null || pattern == null) return false;
            
            String[] strArr = s.split(" ");
            if(strArr.length != pattern.length()) return false;
            
            Map<Character, String> patternMap = new HashMap<>();
            Set<String> sSet = new HashSet<>();
    
            for(int i = 0; i < pattern.length() ; i++) {
                char patternChar = pattern.charAt(i);
                String str = strArr[i];
    
                if(patternMap.containsKey(patternChar)){
                    System.out.println("Getting from map = " + patternMap.get(patternChar) );
                    if(!patternMap.get(patternChar).equals(str)) //If you compare like != then it will be comparing the address space.
                    { 
                        return false;
                    }
                 }else{
                    if(sSet.contains(str) ){
                        return false;
                    }
    
                    sSet.add(str);
                    patternMap.put(patternChar, str);
                 }
    
            }
           return true;
    
        }
    }
    
    
    public static void main(String[] args) {
        WordPattern wp = new WordPattern();
        boolean result = wp.wordPattern("abba", "dog cat cat dog");

        System.out.println("Result =  " + result);
    }
}