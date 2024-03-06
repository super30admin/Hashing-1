// Time Complexity : O(n) where 'n' is the length of the string.
// Space Complexity : O(256) where 256 is the length of ASCII i.e. O(1)
// Did this code successfully run on Leetcode : Yes, https://leetcode.com/problems/isomorphic-strings/
// Any problem you faced while coding this : No


class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s==null && t==null) return false;
        if(s==null || t==null) return false;
        if(s.length()!=t.length()) return false;
        HashMap<Character,Character> sMap = new HashMap<>();
         HashSet<Character> tSet = new HashSet<>();
         
         for(int i=0;i<s.length();i++){
             char sChar = s.charAt(i);
             char tChar = t.charAt(i);
             if(sMap.containsKey(sChar)){
                  if(sMap.get(sChar)!=tChar) return false;
                 }else{
                    if(tSet.contains(tChar)) return false; 
                 else{
                     sMap.put(sChar,tChar);
                     tSet.add(tChar);
                 }
         
    }
}
return true;
    }
}
