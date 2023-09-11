// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes https://leetcode.com/problems/word-pattern/submissions/1045033432/
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only

/*
1. Using a map and set to check the strings are according to the givrn pattern
2. Maintain a hashmap with  character in pattern String and values as strings of s
3. Use Hashset to find if duplicates exists, check if a key has the same value at every index throughout the array, then return true, else return false
*/ 
import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> pat = new HashMap<>();
        // Map<String, Character> sMap = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        char[] charPattern = pattern.toCharArray();
        String[] sArray = s.split(" ");
        if(charPattern.length != sArray.length){
            return false;
        }
        for(int i=0; i< charPattern.length; i++){
            if(!pat.containsKey(charPattern[i])){
                pat.put(charPattern[i],sArray[i]);
                if(set.contains(sArray[i])){
                    return false;
                }
                set.add(sArray[i]);
            }
            else{
                if(!(pat.get(charPattern[i]).equals(sArray[i])))
                    return false;
            }
        }
        return true;
    }
}

//Using 2 hashMaps
class Solution2{
    public boolean wordPattern(String pattern, String s) {
        char[] charPattern = pattern.toCharArray();
        String[] sArray = s.split(" ");
        if(charPattern.length != sArray.length){
            return false;
        }
        Map<Character, String> pat = new HashMap<>();
        Map<String, Character> sMap = new HashMap<>();
        for(int i=0; i< charPattern.length;i++){
            if(!pat.containsKey(charPattern[i])){
                pat.put(charPattern[i], sArray[i]);
            }
            else{
                if(!(pat.get(charPattern[i]).equals(sArray[i]))){
                    return false;
                }   
            }
            if(!sMap.containsKey(sArray[i])){
                sMap.put(sArray[i],charPattern[i]);
            }
            else{
                if(!(sMap.get(sArray[i]).equals(charPattern[i]))){
                    return false;
                }  
            }
        }
        return true;
    }
}