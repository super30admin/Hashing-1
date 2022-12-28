// Time Complexity : 0(1)
// Space Complexity : 0(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// Approach: We create a hashmap for string s: string t mapping)
// Then for that pair, we have a hashset to store the t value.
// In hashmap, if 's' is not present, we add it, if present, we check if the value corrsponds to 't', if not then return false;
// In the hashset , if 't' is not present, meaning 's:t' mapping didnt happen, if present, meaning 't' is already taken by some 's:t' mapping, return false.

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        
        if(s == null && t == null) return true;
        if(s == null || t == null ) return false;
        if(s.length()!=t.length()) return false;
        
        HashMap<Character,Character> sMap=new HashMap<>();
        HashSet<Character> tSet=new HashSet<>();
        
        for(int i=0;i<s.length();i++){
            
            char sChar=s.charAt(i);
            char tChar=t.charAt(i);
            
            if(!sMap.containsKey(sChar)){
                sMap.put(sChar,tChar);
                if(!tSet.contains(tChar)){
                    tSet.add(tChar);
                } else {
                    return false;
                }
            }
            else{
                  if(sMap.get(sChar)!=tChar){
                      return false;
                  }
            }
  
        }
        return true;
        
    }
}
