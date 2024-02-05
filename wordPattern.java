//time complexity: O(n)
//space complexity: 
import java.util.Map;
import java.util.HashMap;
class wordPattern {
    public boolean wordpattern(String pattern, String s) {
        String[] str = s.split(" ");
        if(pattern.length() != str.length) return false;
        Map<Character, String> cMap = new HashMap<>();
        Map<String, Character> strMap = new HashMap<>();
        for(int i = 0;i<pattern.length();i++){
            char c = pattern.charAt(i);
            String word = str[i];
            if(cMap.containsKey(c)){
                if(!cMap.get(c).equals(word)) {
                    return false;
                }
            }
            else{
                if(strMap.containsKey(word)) {
                    return false;
                }
                cMap.put(c,word);
                strMap.put(word,c);
            }
             
        }
        
        //System.out.println(Arrays.toString(str));

        return true;
    }
    
}
