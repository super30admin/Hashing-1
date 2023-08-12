class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        
        HashMap<Character,String> firstMap = new HashMap<>();
        HashMap<String,Character> secondMap = new HashMap<>();
        
        if(words.length != pattern.length())
            return false;

        // first check
        for(int i=0;i<pattern.length();i++){
            char key = pattern.charAt(i);
            String value = words[i];
            if(!firstMap.containsKey(key)){
                firstMap.put(key,value);
            }else{
                if(!firstMap.get(key).equalsIgnoreCase(value))
                    return false;
            }
        }
        
        // second check
        for(int i=0;i<words.length;i++){
            String key = words[i];
            char value = pattern.charAt(i);
            if(!secondMap.containsKey(key)){
                secondMap.put(key,value);
            }else{
                if(secondMap.get(key)!=value)
                    return false;
            }
        }
        
        //
        return true;
    }
}
