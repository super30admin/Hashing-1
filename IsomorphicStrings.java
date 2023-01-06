public class IsomorphicStrings {
    // using two hashmaps
    public boolean isIsomorphicHashMaps(String s, String t) {
        if(s.length() != t.length()) return false;
        
        HashMap<Character , Character> s_map = new HashMap<>();
        HashMap<Character , Character> t_map = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            if(s_map.containsKey(schar)){
                if(s_map.get(schar)!=tchar) return false;
            }else{
                s_map.put(schar,tchar);
            }
            
            if(t_map.containsKey(tchar)){
                if(t_map.get(tchar)!=schar) return false;
            }else{
                t_map.put(tchar,schar);
            }
        }
        return true;
    }

    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        
        char[] s_map = new char[256];
        char[] t_map = new char[256];
        
        for(int i=0;i<s.length();i++){
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            if(s_map[schar - ' ']!=0){ // checking if element is present or not
                if(s_map[schar - ' ']!=tchar) return false;
            }else{
                s_map[schar - ' ']=tchar;
            }
            
            if(t_map[tchar - ' ']!=0){ // checking if element is present or not
                if(t_map[tchar - ' ']!=schar) return false;
            }else{
                t_map[tchar - ' ']=schar;
            }
        }
        return true;
    }

        // using hashmap & hashset
        public boolean isIsomorphicHashMapSet(String s, String t) {
            if(s.length() != t.length()) return false;
        
            HashMap<Character , Character> s_map = new HashMap<>();
            HashSet<Character> t_set = new HashSet<>();
            
            for(int i=0;i<s.length();i++){
                char schar = s.charAt(i);
                char tchar = t.charAt(i);
                
                if(s_map.containsKey(schar)){
                    if(s_map.get(schar)!=tchar) return false;
                }else{
                    if(t_set.contains(tchar)) return false;
                    else{
                        s_map.put(schar,tchar);
                        t_set.add(tchar);
                    }
                }
            }
            return true;
        }
}


// Time complexity - O(n)
// Space complexity - O(1)
