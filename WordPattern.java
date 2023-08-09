class WordPattern{

        public boolean findString(String pattern, String s){
        HashMap<Character, String> smap = new HashMap<Character, String>();
        HashMap<String, Character> tmap = new HashMap<String, Character>();
        String [] words = s.split(" ");

        if(pattern.length() != words.length) return false;

        for(int i = 0; i<pattern.length(); i++){
            char schar = pattern.charAt(i);
            String tString = words[i];
            if(smap.containsKey(schar)){
                if(smap.get(schar) != tString) return false; // Here we check the mapping with String s and t.
            }else { 
                smap.put(schar,tString);
            }

            if(tmap.containsKey(tString)){
                if(tmap.get(tString) != schar) return false;
            }else { 
                tmap.put(tString,schar);
            }
        }
        return true;    
    }
}