//Time complexity : O(n) n is the length of s
//Space complexity :  O(1) // since we will have 26 maximum characters

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        HashMap<Character,Character> map2 = new HashMap<Character,Character>();
        
        if(s.length()!= t.length()){
            return false;
        }
    
        
        for(int i=0; i<t.length() ; i++){
            
           char s1 = s.charAt(i);
            char t1 = t.charAt(i);
            
            if(!map.containsKey(s1)){
                
                    if(map2.containsKey(t1)){
                         if(map2.get(t1)!=s1)
                             return false;
                    }
            
                map.put(s1,t1);
                 map2.put(t1,s1);
            }
            
            else{
               if(map.get(s1)!=t1)
                   return false;
        
            }
                              
    }
        return true;
    }
}
