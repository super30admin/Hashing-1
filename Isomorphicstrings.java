// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no
// Approach:Writing a base case if both strings are different length. 
//Using two hashmaps to store two strings mapping. from for loop will extract characters from both strings and compare S-T as c1 is equal to c2 or not same for T-S if not equal return false or else we will map c1 and c2.At end of the loop if mapping done for each character no false retruns so we will return true 
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
     

        HashMap<Character, Character> mapST =new HashMap <> ();
        HashMap<Character, Character> mapTS =new HashMap <> ();

        for(int i=0; i< s.length(); i++) {
        char c1= s.charAt(i);
        char c2= t.charAt(i);

        if(mapST.containsKey(c1)){
            if (mapST.get(c1) != c2){
                return false;
            }  
        } else {
            mapST.put(c1,c2);
        }

        if(mapTS.containsKey(c2)){
            if(mapTS.get(c2) != c1){
                return false;
            }
        } else {
            mapTS.put(c2,c1);
        }

      }
      return true;

        
    }
}