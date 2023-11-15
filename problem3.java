// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : 

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class problem3 {
    public static boolean wordPattern(String pattern, String s) {
        Map<Character,String> map = new HashMap<>(); // put key value pairs in map and insert only values in set
        Set<String> set = new HashSet<>();
        String[] words = s.split(" ");
        if(pattern.length() != words.length) return false;
        for(int i = 0; i<pattern.length() ; i++){
            char pChar = pattern.charAt(i);    
            String cStr = words[i];  
            if(map.containsKey(pChar)){ // check if the pattern char is present in map if so check with s string
                if(!map.get(pChar).equals(cStr)) {
                    return false;
                    }
            }else{
                if(set.contains(cStr)) return false;
                set.add(cStr); // add to set and map
                map.put(pChar,cStr);
            }
        }
        return true;        
    }

    public static void main(String[] arg) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }


}