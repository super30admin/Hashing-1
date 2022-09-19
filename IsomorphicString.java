// Time Complexity : O(n)  n is lenth of s or t 
// Space Complexity: O(1)
// submission successful on leetcode
class Solution {
    public boolean isIsomorphic(String s, String t) {
     
        if(s.length()!= t.length()) return false;
        if(s==null && t==null) return true;
        
        // 2 Hashmap solution
        HashMap<Character,Character> smap = new HashMap<>();
        HashMap<Character,Character> tmap= new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char sChar=s.charAt(i);
            char tChar=t.charAt(i);
            if(smap.containsKey(sChar)){
                
                // if character in tChar is not getting mapped to schar
                if(tChar !=smap.get(sChar)){
                    return false;
                }
            }
             else{
                 smap.put(sChar,tChar);
             }  
            if(tmap.containsKey(tChar)){
                
                if(sChar != tmap.get(tChar)){
                    return false;
                }
            }
            else{
                tmap.put(tChar,sChar);
            }
            
        }
        return true;
    }
}