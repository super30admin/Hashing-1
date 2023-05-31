// Time Complexity : O(mk)  + O(nk)(split operation)
// Space Complexity : O(nk) - (storing split elements in array)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Implement using 2 hashmaps and can also be implemented using 1 hashmap and 1 hashset
class Solution {
  public boolean wordPattern(String pattern, String s) {
      // the below operation costs nk where n is the no.of words of average length k
      String[] strArray = s.split(" ");
      if(pattern.length() != strArray.length)return false;
      //pMap has mapping from character to pattern
      HashMap<Character, String>  pMap = new HashMap<>();
        //sMap has mapping from Pattern to character
       HashMap<String, Character>  sMap = new HashMap<>();

       for (int i =0 ; i< pattern.length();i++){
           char pChar = pattern.charAt(i);
           String str = strArray[i];
           if(pMap.containsKey(pChar)){
               if(!str.equals(pMap.get(pChar))){
return false;
               }
           }
           else{
               pMap.put(pChar,str);
           }
           if(sMap.containsKey(str)){
              if(sMap.get(str)!= pChar){
 return false;
               }
           }
           else{
                 sMap.put(str,pChar);
           }
       }
      return true;
  }
}