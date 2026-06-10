class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
       
        if(s.length() < t.length() || s.length() > t.length()) return false;

        char arrS[] = new char[256];
        char arrT[] = new char[256];

        for(int i = 0; i < s.length(); i++ ){
            
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(arrS[sChar - ' '] != 0){
                if(arrS[sChar - ' '] != tChar) return false;
            }else{
                arrS[sChar- ' '] = tChar;
            }

            if(arrT[tChar - ' '] != 0){
                if(arrT[tChar - ' '] != sChar) return false;
            }else{
                arrT[tChar - ' '] = sChar;
            }
        }

        return true;
       
    }
}