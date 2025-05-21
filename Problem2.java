//205 : ISOMORPHIC STRINGS
//TC : O(n) , SC = O(n)
// Solved successfully on leetcode and faced no issues

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){return false;}
        HashMap<Character , Character> h1 = new HashMap<>();  
       HashMap<Character , Character> h2 = new HashMap<>();  
        
        for(int i = 0; i < s.length() ; i++){
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            if(h1.containsKey(schar)){
                if(h1.get(schar)!=tchar){
                    return false;
                }
            }
            else{
                    h1.put(schar , tchar);
            }
            if(h2.containsKey(tchar)){
                if(h2.get(tchar)!=schar){
                    return false;
                }
            }
            else{
                    h2.put(tchar , schar);
            }
           
        }
        return true;
    }
    }
   