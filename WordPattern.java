class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> sMap = new HashMap<>();
        HashMap<String,Character> tMap = new HashMap<>();

       String[] words = s.split(" ");
       if(pattern.length() != words.length) { return false;}
        for(int i=0; i< pattern.length(); i++) {
            char sChar = pattern.charAt(i);
            // char tChar = t.charAt(i);

            if(sMap.containsKey(sChar)) {
                if(!sMap.get(sChar).equals(words[i])) return false;
            }
            else {
                sMap.put(sChar, words[i]);
            }

            if(tMap.containsKey(words[i])) {
                if(tMap.get(words[i]) != sChar) return false;
            }
            else {
                tMap.put(words[i], sChar);
            }
        }
        return true;
        
        
    }
}