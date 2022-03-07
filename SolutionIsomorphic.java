class SolutionIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> sMap = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        
        for(int i = 0; i < s.length(); i++){
            if(sMap.containsKey(s.charAt(i))){
                if(sMap.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }else{
                if(set.contains(t.charAt(i))){
                    return false;
                }else{
                    sMap.put(s.charAt(i),t.charAt(i));
                    set.add(t.charAt(i));                    
                }
            }
        }
        return true;
    }
}
