// Time Complexity :O(n) 
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no
// Using two hashmap: one for s to t, another for t to s

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> smap = new HashMap<>();//s to t
        HashMap<Character, Character> tmap = new HashMap<>();//t to s
        for(int i=0;i<s.length();i++){
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            if (smap.containsKey(schar)) {
                if (smap.get(schar) != tchar) return false;//mismatch
            } else {
                smap.put(schar, tchar);//new entry to smap
            }

            if (tmap.containsKey(tchar)) {
                if (tmap.get(tchar) != schar) return false;//mismatch
            } else {
                tmap.put(tchar, schar);//new entry to tmap
            }
        }
        return true;

    }
}