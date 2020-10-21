// Time Complexity : o(n)
// Space Complexity : o(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Leetcode : 290

class Solution {
    public boolean wordPattern(String pattern, String s) {
        //splitting the sentence string and saving in an array
        String[] split_s = s.split(" ");
        //two individual hashmaps for both sides
        HashMap<Character,String> map1 = new HashMap<>();
        HashMap<String,Character> map2 = new HashMap<>();
        //Edge case
        if(split_s.length!=pattern.length()){
            return false;
        }  
        
        for(int i = 0 ; i < pattern.length(); i++){
            //add if not exists
            if(!map1.containsKey(pattern.charAt(i))){
                map1.put(pattern.charAt(i),split_s[i]);   
            }
            else{
                //check if the corresponding value is same
                if(!map1.get(pattern.charAt(i)).equals(split_s[i])){
                return false;
                }
            }
            
            //same for other hashmap
            if(!map2.containsKey(split_s[i])){
                map2.put(split_s[i],pattern.charAt(i));
            }else{
                if(!map2.get(split_s[i]).equals(pattern.charAt(i))){
                    return false;
                }
            }
        }
        return true;
    }
}