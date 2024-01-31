// 
// Space complexity: O(nk)
class Solution {
    public boolean wordPattern(String pattern, String s) {
        if(s==null) return false;
        String [] words=s.split(" ");
        if(pattern.length()!= words.length) return false;
        

        HashMap<Character,String> pMap=new HashMap<>();
        HashSet<String> wordset= new HashSet<>();

        for(int i=0;i<pattern.length();i++){
            char pChar = pattern.charAt(i);
            String word = words[i];
            if(pMap.containsKey(pChar)){
                if(!pMap.get(pChar).equals(word)) return false;
            }else{
                if(wordset.contains(word)){
                    return false;
                }
                pMap.put(pChar, word);
                wordset.add(word);
            }

        }
        return true;
        
    }
}