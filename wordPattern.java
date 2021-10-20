//Time complexity : O(n) 
//Space complexity :  O(n)

class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap<Character,String> charMap = new  HashMap<Character,String>();
        HashMap<String,Character> valueMap = new  HashMap<String,Character>();
        
        String[] words = s.split(" ");
        
        char[] ch = pattern.toCharArray();
  
        if(words.length != ch.length ){
            return false;
        }
        
       
         for(int i = 0 ; i < ch.length; i++) {
             
             char c1 = ch[i];
             String s1 = words[i];
             
             if(!charMap.containsKey(c1)){
                 if(valueMap.containsKey(s1)){
                     return false;
                 }else{
                 charMap.put(c1,s1);
                 valueMap.put(s1,c1);
                 }
             }else{
                 if(!charMap.get(c1).equals(s1)){
                     return false;
                 }
             }
         
        }
        
        return true;
}
}
