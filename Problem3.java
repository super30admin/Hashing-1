public class Problem3 {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> ptos = new HashMap<>();
        HashMap<String, Character> stop = new HashMap<>();
        
        String[] words = s.split(" ");
        
        if (pattern.length()!= words.length){
            return false;
        }
        
        for (int i=0; i<pattern.length(); i++){
            char p = pattern.charAt(i);
            String w = words[i];
            
            if (ptos.containsKey(p) && !ptos.get(p).equals(w)) {
                return false;
            }
            else{
                ptos.put(p, w);
            }
                
            
            if (stop.containsKey(w) && !stop.get(w).equals(p))
            {
                return false;
            }    
            else{
                stop.put(w, p);
            }
                
        }
        
        return true;
    }
}
