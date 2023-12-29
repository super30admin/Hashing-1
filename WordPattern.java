
class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String,Character> smap = new HashMap<>();
        HashSet<Character> tset = new HashSet<>();

        String[] schar = s.split(" ");
        char[] tchar = pattern.toCharArray();

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