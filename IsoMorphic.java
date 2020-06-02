/*
    Time Complexity : O(N)
    Space Complexity : O(1)
    Is worked on Leetcode : YES
*/

class IsoMorphic {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length ()) return false;
        char[] smap = new char[100];
        char[] tmap = new char[100];
        
        for(int i=0;i<s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
//             if hash of charchter char - ' ' will return index position for charachter 
            
            if (smap[sChar - ' '] != 0){
                if(smap[sChar - ' '] != tChar)return false;
            }else{
                smap[sChar - ' ']  = tChar;
            }
            
            if (tmap[tChar - ' '] != 0){
                if(tmap[tChar - ' '] != sChar)return false;
            }else{
                tmap[tChar - ' ']  = sChar;
            }
            
        }
        
        return true;
    }
}