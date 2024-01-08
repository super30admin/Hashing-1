//i took one hashmap to check from value to key and key to value to make sure that character is not used in mapping
// Time Complexity :o(n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode :yess
// Any problem you faced while coding this :No

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s==null && t==null) return true;
        if(s==null || t==null) return false;
        if(s.length()!=t.length()) return false;
    HashMap<Character, Character> Map= new HashMap<>();
    for(int i=0; i<s.length();i++){
        char schar= s.charAt(i);
        char tchar= t.charAt(i);
        if(!Map.containsKey(schar)){
            if(!Map.containsValue(tchar)){
                Map.put(schar,tchar);
            }
            else{
                return false;
            }
        }
        else{
            if(Map.get(schar)!=tchar){
                return false;
            }
        }
    }
    return true;

    }
}