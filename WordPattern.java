import java.util.HashMap;
//tc : o(n) //n is len of pattern
//sc: o(n) //n is len of pattern
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(words.length != pattern.length())return false;

        HashMap<Character,String> cmap = new HashMap<>();
        HashMap<String,Character> wmap = new HashMap<>();

        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            String word = words[i];
            if(cmap.containsKey(ch)){
                if(!cmap.get(ch).equals(word)){
                    return false;
                }
            }
            else{
                cmap.put(ch,word);
            }

            if(wmap.containsKey(word)){
                if(wmap.get(word) != ch){
                    return false;
                }
            }
            else{
                wmap.put(word,ch);
            }

        } 

        return true;
    }
}