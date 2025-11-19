class Solution {
    //using 2 HashMaps
    public boolean isIsomorphic(String s, String t) {
        int sl = s.length();
        int tl = t.length();
        if(sl != tl) return false;
        HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Character> tmap = new HashMap<>();

        for(int i = 0;i<sl; i++){
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            //inserting in smap
            if(smap.containsKey(schar)){
                if(smap.get(schar) != tchar) return false;
            }else{
                smap.put(schar, tchar);
            }
            //inserting in tmap
            if(tmap.containsKey(tchar)){
                if(tmap.get(tchar) != schar) return false;
            }else{
                tmap.put(tchar, schar);
            }

        }
        return true;
    }

    //Internally hashmap use arrays
    public boolean isIsomorphic(String s, String t) {
        int sl = s.length();
        int tl = t.length();
        if(sl != tl) return false;
        //HashMap<Character, Character> smap = new HashMap<>();
        //HashMap<Character, Character> tmap = new HashMap<>();
        char[] smap = new char[95];
        char[] tmap = new char[95];
        for(int i = 0;i<sl; i++){
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            //inserting in smap
            // Since s and t consist of any valid ascii character & space is first valid ascii char
            if(smap[schar - ' '] != 0 ){ //65-32 = 33 smap.containsKey(schar)
                if(smap[schar - ' '] != tchar) return false;
            }else{
                smap[schar - ' '] = tchar;
            }
            //inserting in tmap
            if(tmap[tchar - ' '] != 0){
                if(tmap[tchar - ' '] != schar) return false;
            }else{
                tmap[tchar - ' '] = schar;
            }

        }
        return true;
    }

}