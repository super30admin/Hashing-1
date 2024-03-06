// Time Complexity : O(n) where 'n' is the length of the string.
// Space Complexity : O(256) where 256 is the length of ASCII i.e. O(1)
// Did this code successfully run on Leetcode : Yes, https://leetcode.com/problems/isomorphic-strings/
// Any problem you faced while coding this : No

//The approach used in this program is character array which will check the character and then match it to check isomorphic String.


class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s==null && t==null) return false;
        if(s==null || t==null) return false;
        if(s.length()!=t.length()) return false;
        //HashMap<Character,Character> sMap = new HashMap<>();
         //HashMap<Character,Character> tMap = new HashMap<>();

         char[] sMap = new char[256];
          char[] tMap = new char[256];
         
         for(int i=0;i<s.length();i++){
             char sChar = s.charAt(i);
             char tChar = t.charAt(i);
             if(sMap[sChar- ' ']!=0){
                  if(sMap[sChar- ' ']!=tChar) return false;
                 }else{
                     sMap[sChar- ' ']=tChar;
                 }
                if(tMap[tChar- ' ']!=0){
                  if(tMap[tChar- ' ']!=sChar) return false;
                 }else{
                     tMap[tChar- ' ']=sChar;
                 }
         }
         return true;
    }
}
