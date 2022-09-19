// Time complexity : O(m) m is the legnth of the string s
//Space Compexity : O(1) because HashMap can have 26 characters only 
// Suucessfully submitted on leetcode

class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] strArray= s.split(" ");
        if(pattern.length()!= strArray.length) return false;
        
        HashMap<Character, String> pMap= new HashMap<>();
       // HashMap<String,Character> sMap= new HashMap<>();
        HashSet<String> set = new HashSet<>();
        
        for(int i=0;i<pattern.length();i++){
            String str= strArray[i];
            char c= pattern.charAt(i);
            if(pMap.containsKey(c)){
                if(!str.equals(pMap.get(c))){
                    return false;
                }
            }
            else{
               // pMap.put(c,str);
                if(set.contains(str)){
                    return false;
                }
                pMap.put(c,str);
                set.add(str);
            }
//             if(sMap.containsKey(str)){
//                 if(c!=sMap.get(str)){
                    
//                 }
//             }
        }
         return true;
    }
   
}