// Time Complexity : O(n)  - as we traverse through the string
// Space Complexity : O(1) - Though we have 2 arrays  the max elements inserted can be uppercase 26 + lowercase 26 = 52.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/* we can implement using 2 hashmaps , just 1 hashmap + 1hashset, 2 char arrays with same space and time complexity .
 * Implemented with 2 char arrays
*/
class Solution {
    public boolean isIsomorphic(String s, String t) {
        //base case check if length are same
        if(s.length() != t.length()) return false;
        //By using 2 char arrays
      char[] sMap = new char[100];
       char[] tMap = new char[100];
         for(int i=0;i<s.length();i++){
             char sChar = s.charAt(i);
              char tChar = t.charAt(i);
            if(sMap[sChar - ' ']!=0){
               if(sMap[sChar - ' ']!=tChar){
                   return false;
               }
            }
               else{
                   sMap[sChar - ' ']=tChar;
                  
               }
            
                    if(tMap[tChar - ' ']!=0){
               if(tMap[tChar - ' ']!=sChar){
                   return false;
               }
                    }
               else{
                   tMap[tChar - ' ']=sChar;
               }
           
         }
        return true;
    }
  }