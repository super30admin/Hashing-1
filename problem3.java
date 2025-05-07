// Leetcode 290  Word Pattern
// Executed on Leetcode
// Time complexity - O(n)
// Space complexity - O(n)

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] match = s.split(" ");
        HashMap <Character,String> pTos = new HashMap();
        HashMap <String,Character> sTop = new HashMap();
        if(match.length != pattern.length()){
            return false;
        }
        for(int i=0;i<match.length;i++){
            if(pTos.containsKey(pattern.charAt(i))){
                if(!pTos.get(pattern.charAt(i)).equals(match[i])){
                    return false;
                }
            }else{
                if(sTop.containsKey(match[i])){
                    return false;
                }
                pTos.put(pattern.charAt(i),match[i]);
                sTop.put(match[i],pattern.charAt(i));
            }
            
        }
        return true;
    }
}