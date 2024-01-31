// Time complexity:o(n)
// space complexity:O(1)
// approach: keep 2 hash map map key:value for both the characters in string if they are  not already prent then put, if it is present the check for the corresponding value for key in 1st map is equal to present value

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        if(s== null && t==null) return false;
        if(s== null || t==null) return false;

        HashMap<Character,Character> sMap=new HashMap<>();
        HashMap<Character,Character> tMap=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char sChar=s.charAt(i);
            char tChar=t.charAt(i);
            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar)!=tChar)return false;
            }else{
                sMap.put(sChar,tChar);
            }
            if(tMap.containsKey(tChar)){
                if(tMap.get(tChar)!=sChar)return false;
            }else{
                tMap.put(tChar,sChar);
            }
        }
        return true;
        
    }
}