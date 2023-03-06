class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Character> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                String a = String.valueOf(map.get(s.charAt(i)));
                String b = String.valueOf(t.charAt(i));
                if(!a.equalsIgnoreCase(b)){
                    return false;
                }
            }
            else{
                Set<Character> set = new HashSet<>(map.values());
                if(set.contains(t.charAt(i))){
                    return false;
                }
                map.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
}