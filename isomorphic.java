class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap <Character, Character> sMap = new HashMap<>();
        HashMap <Character, Character> tMap = new HashMap<>();
        int sl = s.length();
        int tl = t.length();
        if(sl != tl){
            return false;
        }
        for(int i =0; i < sl; i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar) != tChar){
                    return false;
                }
            } else {
                sMap.put(sChar, tChar);
            }

            if(tMap.containsKey(tChar)) {
            if(tMap.get(tChar) != sChar) {
                return false;
            }
            } else {
                tMap.put(tChar, sChar);
            }
        }
        return true;
    }
}

//TC: o(n)
//SC: O(1)