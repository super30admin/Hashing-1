// Time Complexity : O(log(N))
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this: similar to Isomorphic Strings problem but hashmap now has one String

class Solution {
    public boolean wordPattern(String s, String pattern) {
        
        String [] words = pattern.split(" ");//putting words in an array
        
        if(s.length() != words.length){
            return false;
        }
        
        HashMap <Character, String> sMap = new HashMap<>();//first hashmap for string s
        HashMap <String, Character> pMap = new HashMap<>();//second hashmap for string t
        
        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            String givenWord  = words[i];
            System.out.println(sChar + " " + givenWord);
            
            if(!sMap.containsKey(sChar)){
                sMap.put(sChar, givenWord);
            }else{
                if(sMap.get(sChar).equals(givenWord) == false){//compare strings with .equals
                    return false;
                }
            } 
            
            if(!pMap.containsKey(givenWord)){
                pMap.put(givenWord, sChar);
            }else{
                if(pMap.get(givenWord) != sChar){//compare characters using !=
                    return false;
                }
            }                       
        }
        
        return true;
        
    }
}