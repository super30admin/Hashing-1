class Solution {
    public boolean wordPattern(String design, String s) {
        
        String[] parts = s.split(" ");
        if (parts.length != design.length()) return false;
        
        HashMap <Character, String> dMap = new HashMap<>();
        HashMap <String, Character> pMap = new HashMap<>(); //parts map - pMap
        
        for(int i = 0; i< design.length(); i++){
            if(!dMap.containsKey(design.charAt(i))){
                dMap.put(design.charAt(i), parts[i]);
            }
            else{
                if (!dMap.get(design.charAt(i)).equals(parts[i])) return false; 
            }
            
            if(!pMap.containsKey(parts[i])){
                pMap.put(parts[i], design.charAt(i));
            }
            else{
                if (!pMap.get(parts[i]).equals(design.charAt(i))) return false; 
            }
        }   
    return true;
    }
}