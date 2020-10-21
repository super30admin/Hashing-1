// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Leetcode : 205

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        //maintain 2 hashmaps for both the strings
        HashMap<Character,Character> map_s = new HashMap<>();
        HashMap<Character,Character> map_t = new HashMap<>();
        
        for(int i= 0 ; i < s.length() ; i++){
            Character str_s = s.charAt(i);
            Character str_t = t.charAt(i);
            //check for the corresponding value from map
            if(map_s.containsKey(str_s)){
                if(map_s.get(str_s)!=str_t) return false;
            }else{
                    map_s.put(str_s,str_t);
                }
           if(map_t.containsKey(str_t)){
                if(map_t.get(str_t)!=str_s) return false;
            }else{
                    map_t.put(str_t,str_s);
                }   
            }
             return true;
        }

}


//Another Approach
class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        int helper1 [] = new int[256];
        int helper2 [] = new int[256];

        for(int i=0; i<s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(helper1[a] != helper2[b]) return false;
            helper1[a] = i + 1;
            helper2[b] = i + 1;
        }
        
        return true;
    }
}