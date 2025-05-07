// Leetcode 205  Isomorphic String
// Executed on leetcode
// Time Complexity - O(n)
// Space Complexity -O(n)
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hashmap1 = new HashMap();
        HashMap<Character,Character> hashmap2 = new HashMap();
        
        for(int i=0;i<s.length();i++){
            
            if(hashmap1.containsKey(s.charAt(i))){
               
                if(hashmap1.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }else{
                if(hashmap2.containsKey(t.charAt(i))){
                    return false;
                }
                hashmap1.put(s.charAt(i),t.charAt(i));
                hashmap2.put(t.charAt(i),s.charAt(i));
            }
            
        }
        return true;
        
    }
}