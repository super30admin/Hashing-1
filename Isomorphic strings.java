//TC: O(N)
//SC: 2*O(N)
//Approach:
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        for(int i =0; i< s.length(); i++) {
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            if(!sMap.containsKey(schar)){
                sMap.put(schar, tchar);
            } else if(sMap.get(schar) != tchar) {
                return false;
            }
            if(!tMap.containsKey(tchar)){
                tMap.put(tchar, schar);
            } else if(tMap.get(tchar) != schar) {
                return false;
            }
        }
        return true;
    }
}