// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode : No
// Any problem you faced while coding this : Duplicate values are being mapped against unique keys


// Your code here along with comments explaining your approach

class Solution {
    public boolean wordPattern(String pattern, String str) {
        
        if(pattern.length()==0 && str.length()==0) return true;
        if(pattern.length()==0 || str.length()==0) return false;
        
      //  if(pattern.length() != str.length()) return false; 
        
        String[] strs=str.split("");
        
        HashMap<Character, String> map = new HashMap<>();
        
        for(int i=0; i<pattern.length(); i++){
            if(!map.containsKey(pattern.charAt(i)) && !map.containsValue(strs[i]))
                map.put(pattern.charAt(i), strs[i]);
        }
       
        for(int i=0;i<pattern.length();i++){
            if(!map.get(pattern.charAt(i)).equals(strs[i])){
                System.out.println("x");
                return false;   
            }
        }
        
        return true;
        
    }
}