// Time Complexity : O(n)
//    O(n+n) = O(2n) = O(n)
//      split string function: O(n)
//      iterating all letters: O(n)
// Space Complexity :
//      Since it is hashmap of characters
//          we will have space O(26+26) = O(52) = O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
import java.util.HashMap;

class Problem3 {

    /**find word pattern */
    public boolean wordPattern(String pattern, String str) {

        // intial check
        if(pattern!=null && str!=null){

             String[] words = str.split(" ");

             // check pattern and word length is equal
             if(pattern.length() == words.length){
                 
                // hashmap to map Character to String
                 HashMap<Character, String> map = new HashMap<>();
                 HashMap<String, Character> revMap = new HashMap<>();
                 
                 // iterate characters in the pattern
                 for(int i=0;i<pattern.length();i++){
                     
                     char x = pattern.charAt(i);
                     
                     // if is not present
                     if(!map.containsKey(x))
                         map.put(x, words[i]);
                     
                     if(!revMap.containsKey(words[i]))
                         revMap.put(words[i], x);
                     
                    // verify correct mapping
                     if(!(map.get(x)).equals(words[i]) || revMap.get(words[i]) != x)
                         return false;
                 }
                 
                 return true;
 
             }else
                 return false;
        }else
             return false;
         
     }

}