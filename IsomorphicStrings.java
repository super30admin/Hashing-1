// Take 2 hashmaps and get the characters from the string and check if the character is present in the Hashmap. 
If the character is present does it match with the character in the other string or not. 
If it does not match then return false. Repeat the same for the other string as well.
class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s == null && t == null){
            return true;
        }
        if(s== null || t == null){
            return false;
        }
        HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Character> tmap = new HashMap<>();
        for(int i=0; i < s.length(); i++){
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            if(smap.containsKey(schar)){
                if(smap.get(schar) != tchar ) {
                    return false;
                }
            }else {
                smap.put(schar,tchar);
            }

            if(tmap.containsKey(tchar)){
                if(tmap.get(tchar) != schar) {
                    return false;
                }
            } else {
                    tmap.put(tchar, schar);
            }
        }
        return true;    
    }
}    