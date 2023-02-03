//SC: O(256) i.e constant
//TC: O(n)
class Solution {
    public boolean wordPattern(String pattern, String s) {
        if(s == null || s.length() == 0) return false;
        String[] words = s.split(" ");
        int w = words.length;
        if(pattern.length() != words.length) return false;
        HashMap<Character, String> pmap = new HashMap<>();
        HashMap<String, Character> wmap = new HashMap<>();

        for(int i = 0; i < w; i++){
            char p = pattern.charAt(i);
            if(!pmap.containsKey(p)){
                pmap.put(p,words[i]);
            }else{
                if(!pmap.get(p).equals(words[i])) return false;
            }

            if(!wmap.containsKey(words[i])){
                wmap.put(words[i], p);               
            }else{
                if(!wmap.get(words[i]).equals(p)) return false;
            }

        }
        return true;
    }
}
