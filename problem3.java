class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap indexMap = new HashMap();
        
        String[] wordsArr = s.split(" ");
        
        
        if(pattern.length() != wordsArr.length)
            return false;
        
        for(Integer i=0; i<wordsArr.length; i++){
            
            char letter = pattern.charAt(i);
            String word = wordsArr[i];
            
            if(!indexMap.containsKey(letter))
                indexMap.put(letter, i);
            
            if(!indexMap.containsKey(word))
                indexMap.put(word, i);
            
            if(indexMap.get(letter) != indexMap.get(word))
                return false;
        }
        
        return true;
        
    }
}