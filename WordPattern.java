import java.util.HashMap;

/*
Time Complexity : O(n) where n is the number of characters in the string.
Space Complexity : O(n)
Ran on Leetcode : Yes
Approach : Used two Hashmaps for s to t and t to s mappings.
*/
class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        
        String[] stArray = s.split(" ");
        if(pattern.length() != stArray.length) return false;
            
        HashMap<Character,String> pMap = new HashMap();
        HashMap<String,Character> sMap = new HashMap();
         
        for(int i= 0 ; i < pattern.length() ; i++){
            
            char c = pattern.charAt(i);
            String st = stArray[i];
            
            if(pMap.containsKey(c)){
                if(!pMap.get(c).equals(st)){
                    return false;
                }
                
            }else{
                pMap.put(c, st);
            }
            
            if(sMap.containsKey(st)){
                if(sMap.get(st)!=c){
                    return false;
                }
                
            }else{
                sMap.put(st, c);
            }
            
            
        }
        
        return true;
    }
    
    public static void main(String args[]){
        WordPattern w = new WordPattern();

        System.out.println(w.wordPattern("abba","dog cat cat dog"));
    }

}