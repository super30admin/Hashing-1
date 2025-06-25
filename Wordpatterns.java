// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no
// Approach:In the base case itself splitting the string and storing in an array. taking two hashmaps to store and going through each string or character.
//check in the pattern that a character matches with string if it does store in pattern or else retrun false and do it same for s map also.
import java.util.HashMap;;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] sArray = s.split(" "); 
        if (pattern.length() != sArray.length){
            return false;
        }
        HashMap<Character,String> mapPattern=new HashMap<>();
        HashMap<String,Character> mapS=new HashMap<>();

        for(int i=0; i<pattern.length();i++){
            char c1 = pattern.charAt(i);         
            String c2 = sArray[i]; 

            if(mapPattern.containsKey(c1)){
            if (!mapPattern.get(c1).equals(c2)){
                return false;
            }  
        } else {
            mapPattern.put(c1,c2);
        }

           if(mapS.containsKey(c2)){
           if (!mapS.get(c2).equals(c1)) {
                return false;
            }
        } else {
            mapS.put(c2,c1);
        }

      }
      return true;


                
    }
}
