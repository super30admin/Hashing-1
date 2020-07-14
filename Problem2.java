// Time Complexity : O(n)
//      n: length of string
// Space Complexity : O(1)
//      Since it is hashmap of characters
//          we will have space O(26+26) = O(52) = O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : Requirement of second hashmap


// Your code here along with comments explaining your approach
import java.util.HashMap;

class Problem2 {
    public boolean isIsomorphic(String s, String t) {

        // check if both string length is same
        if(s!=null && t!=null && s.length() == t.length()){

            // map to store charater
            HashMap<Character, Character> map = new HashMap<>();
            // reverse map
            HashMap<Character, Character> revMap = new HashMap<>();
            
            // iterate all the characters of string
            for(int i=0;i<s.length();i++){

                // charater
                char x = s.charAt(i);
                char y = t.charAt(i);

                // add if not present
                if(!map.containsKey(x))
                      map.put(x, y);
                if(!revMap.containsKey(y))
                      revMap.put(y, x);
                
                // check mapping in both hashmap      
                if(map.get(x)!= y || revMap.get(y)!= x)
                    return false;
            }
            // return true 
            return true;
            
        }
        else
            return false;
        
    }
}