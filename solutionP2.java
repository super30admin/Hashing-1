class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Character> sMap = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            if(!sMap.containsKey(s.charAt(i))){
             sMap.put(s.charAt(i),t.charAt(i));
             if(set.contains(t.charAt(i))){
                 return false;
             }
            set.add(t.charAt(i));
            }
            else if(sMap.get(s.charAt(i))!=t.charAt(i)){
                return false;
            }
        }
        return true;

    }
}
