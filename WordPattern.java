import java.util.*;

class WordPattern {
    public boolean wordPattern(String pattern, String input) {
        char [] chars = pattern.toCharArray();
        
        String [] inputs = input.split(" ");
        
        if(chars.length != inputs.length) return false;
        
        Map<Character, String> map = new HashMap();
        Set<String> hashSet = new HashSet();
        
        for(int i=0;i<chars.length;i++){
            Character ch = chars[i];
            String current = inputs[i];
            
            //check if set contains the answer but the map does not contain the question.
            if(hashSet.contains(current) && !map.containsKey(ch)){
                return false;
            }
            
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(current)){
                    return false;
                }
            }else{
                map.put(ch,current);
                hashSet.add(current);
            }
        }
        
        return true;
        
    }
}