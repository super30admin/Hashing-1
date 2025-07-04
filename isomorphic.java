class Solution {
    public boolean isIsomorphic(String s, String t) {
         if (s == null && t == null) return true;
        if (s == null || t == null) return false;
        if (s.length() != t.length()) return false;

        char[] sMap = new char[95];
        char[] tMap = new char[95];

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (sMap[sChar - ' '] != 0) {
                if (sMap[sChar - ' '] != tChar) return false;
            } else {
                sMap[sChar - ' '] = tChar;
            }

            if (tMap[tChar - ' '] != 0) {
                if (tMap[tChar - ' '] != sChar) return false;
            } else {
                tMap[tChar - ' '] = sChar;
            }
        }

        return true;
         }
}


// 1 HASHMAP 1 HASHSET
/*
   HashMap<Character,Character> map=new HashMap<>();
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char schar=s.charAt(i);
            char tchar=t.charAt(i);

            if(map.containsKey(schar)){
                if(map.get(schar)!=tchar) return false;
            }
            else{
                if(set.contains(tchar) ) return false;
                map.put(schar,tchar);
                set.add(tchar);
            }
        }
        return true;

        */

// 2 HASHMAPS

        /*if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character , Character> sm=new HashMap<>();
        HashMap<Character , Character> tm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char schar=s.charAt(i);
            char tchar=t.charAt(i);
            if(sm.containsKey(schar)){
                if(sm.get(schar)!=tchar){
                    return false;
                }
            }
            else{
                sm.put(schar,tchar);
            }
            if(tm.containsKey(tchar)){
                if(tm.get(tchar)!=schar){
                    return false;
                }
            }
            else{
                tm.put(tchar,schar);
            }
        }
        return true;
        */