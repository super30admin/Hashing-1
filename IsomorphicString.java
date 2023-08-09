class IsomorphicString {
    // Here we use two HashMap to keep map the two string with each other
    public boolean findString(String s, String t){
        HashMap<Character, Character> smap = new HashMap<Character, Character>();
        HashMap<Character, Character> tmap = new HashMap<Character, Character>();
        if(s == null && t == null) return true;
        if(s == null || t == null) return false;
        for(int i = 0; i<s.length(); i++){
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            if(smap.containsKey(schar)){
                if(smap.get(schar) != tchar) return false; // Here we check the mapping with String s and t.
            }else { 
                smap.put(schar,tchar);
            }

            if(tmap.containsKey(tchar)){
                if(tmap.get(tchar) != schar) return false;
            }else { 
                tmap.put(tchar,schar);
            }
        }
        return true;
    }
}