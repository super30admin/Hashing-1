class Isomorphic {
    
    //Time Complexity - o(n)
    //Space Complexity -o(1)
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> stoTMap = new HashMap<Character,Character>();
        Map<Character,Character> ttoSMap = new HashMap<Character,Character>();
        
        if(s.length() != t.length()){
            return false;
        }
        
        for(int i=0;i<s.length();i++){
            
            if(stoTMap.containsKey(s.charAt(i))){
                 if(stoTMap.get(s.charAt(i)) != t.charAt(i)){
                return false;
            }
            }else {
                     stoTMap.put(s.charAt(i),t.charAt(i));
                 }
            
                
          if(ttoSMap.containsKey(t.charAt(i))){
                 if(ttoSMap.get(t.charAt(i)) != s.charAt(i)){
                return false;
            } 
          }else {
                     ttoSMap.put(t.charAt(i),s.charAt(i));
                 }
          
           
        }
        
          return true;  
    }
}