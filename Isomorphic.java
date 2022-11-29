//https://leetcode.com/problems/isomorphic-strings

//Time Complexity :O(N) where N is the size of given array 
//Space Complexity :O(1) constant space because of  map size can only be of size of character set 

//Solution using 2 hash maps.
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())return false;
        Map<Character,Character> smap = new HashMap<>();
        Map<Character,Character> tmap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(smap.containsKey(s.charAt(i)) && smap.get(s.charAt(i))!= t.charAt(i)){
                return false;
                
            }else{
                smap.put(s.charAt(i),t.charAt(i));
            }
            if(tmap.containsKey(t.charAt(i)) && tmap.get(t.charAt(i))!= s.charAt(i)){
                return false;
            }else{
               tmap.put(t.charAt(i),s.charAt(i));
            }
        }
        return true; 
    }
}

//Time Complexity :O(N) where N is the size of given array 
//Space Complexity :O(1) constant space because of  map size can only be of size of character set 

//Solution using 1 hash map for string s and 1 has set for string t.
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())return false;
        Map<Character,Character> smap = new HashMap<>();
        Set<Character> tset = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!smap.containsKey(s.charAt(i))){
                if(tset.contains(t.charAt(i))) return false;
                smap.put(s.charAt(i),t.charAt(i));
                tset.add(t.charAt(i));
            }else{
                if(smap.get(s.charAt(i))!= t.charAt(i)) return false;
            }
        }
        return true;
    }
}
