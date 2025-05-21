//290 Word Pattern
//TC : O(n) SC : O(n)
//solved successfull on the leetcode and faced no issues

class Solution {
    public boolean wordPattern(String pattern, String s) {
         String[] wordss = s.split(" ");
        if (pattern.length() != wordss.length) {
            return false;
        }
        HashMap<Character,String>h1 = new HashMap<>();
        HashMap<String,Character>h2 = new HashMap<>();
        int p = pattern.length();
        for(int i=0;i<p;i++){
        char ch = pattern.charAt(i);
        String word = wordss[i];
          if(h1.containsKey(ch)){
            if(!h1.get(ch).equals(word)){
                return false;
            }
          }
            else{
                h1.put(ch,word);
            }
          if(h2.containsKey(word)){
            if(!h2.get(word).equals(ch)){
                return false;
            }
          }
            else{
                h2.put(word,ch);
            }
        }
        return true;
        
    }
}
