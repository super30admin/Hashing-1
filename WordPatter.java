class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map= new HashMap<>();
        HashMap<String, Character> rmap= new HashMap<>();
        String[] str= s.split(" ");
        if(pattern.length() != str.length) return false;
        for (int i=0 ;i < pattern.length(); i++){
            char p = pattern.charAt(i);
            String ss= str[i];
            if(map.containsKey(p)){
                if( map.get(p).compareTo(ss) !=0) {
                    return false;}
            }
            else map.put(p,ss);
            
            if(rmap.containsKey(ss)){
                if( rmap.get(ss).compareTo(p) !=0){
                   return false;}
            }
            else rmap.put(ss,p);
        }
        return true;
    }
}
