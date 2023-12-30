

class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> smap = new HashMap<>();
        HashSet<Character> tset = new HashSet<>();

        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();

        if(schar.length != tchar.length) return false;

        for(int i = 0; i < tchar.length; i++) {
            if(smap.containsKey(schar[i])) {
                if(smap.get(schar[i]) != tchar[i]) return false;
            } else {
                if(!tset.contains(tchar[i])){
                    tset.add(tchar[i]);
                    smap.put(schar[i], tchar[i]);
                } else return false;
            }
        }

        return true;
    }
}
