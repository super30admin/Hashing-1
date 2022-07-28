class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length()) return false;
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
             char sChar = s.charAt(i);
             char tChar = t.charAt(i);
            
            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar) != tChar) return false;
                
            }else{
                sMap.put(sChar, tChar);
            }
            
            if(tMap.containsKey(tChar)){
                if(tMap.get(tChar) != sChar) return false;
            }
            else{
                tMap.put(tChar, sChar);
            }
        }
        return true;
    }
}



//By using   Array

// class Solution {
//     public boolean isIsomorphic(String s, String t) {
        
//         if(s.length() != t.length()) return false;
         
//         char[] sMap = new char[256];
//         char[] tMap = new char[256];
        
//         for(int i = 0; i < s.length(); i++){
//              char sChar = s.charAt(i);
//              char tChar = t.charAt(i);
            
//             if(sMap[sChar -' '] != 0){
//                 if(sMap[sChar -' '] != tChar) return false;
                
//             }else{ 
//                 sMap[sChar -' '] = tChar;
//             }
            
//             if(tMap[tChar -' '] != 0){
//                 if(tMap[tChar -' '] != sChar) return false;
                
//             }else{
//                 tMap[tChar -' '] = sChar;
//             }
//         }
//         return true;
//     }
// }


//By using HashMap and HashSet

// class Solution {
//     public boolean isIsomorphic(String s, String t) {
        
//         if(s.length() != t.length()) return false;
//         HashMap<Character, Character> sMap = new HashMap<>();
//         HashSet<Character> tSet = new HashSet<>();
        
//         for(int i = 0; i < s.length(); i++){
//              char sChar = s.charAt(i);
//              char tChar = t.charAt(i);
            
//             if(sMap.containsKey(sChar)){
//                 if(sMap.get(sChar) != tChar) return false;
                
//             }else{
//                 if(tSet.contains(tChar)) return false;
//                 else{
//                     sMap.put(sChar, tChar);
//                     tSet.add(tChar);
//                 }
                
//             }
            
            
//         }
//         return true;
//     }
// }