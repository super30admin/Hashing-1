// Time Complexity : O(n)
// Space Complexity : O(1) - we are using auxilary space but its constant therefore, its constant
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public boolean wordPattern(String pattern, String s) {
      //null case 
      if(pattern == null) {
        return false;
      }
      
      // two maps to check mapping from pattern to s and vice versa
      HashMap<Character,String> map1 = new HashMap<>();
      HashMap<String,Character> map2 = new HashMap<>();
      char[] charArr = pattern.toCharArray();
      String[] stringArr = s.split(" ");
      //if length of pattern and s are not equal
      if(charArr.length != stringArr.length) return false;
      
      
      for(int i=0;i<charArr.length;i++) {
        //mapping pattern character and s string 
        if(!map1.containsKey(charArr[i])) {
          map1.put(charArr[i], stringArr[i]);
          
        } else{
          //if char already exist and string does not match then false
          if(!map1.get(charArr[i]).equals(stringArr[i])) {
            System.out.println("x:"+map1.get(charArr[i])+":"+ stringArr[i]);
            return false;
          }
        }
        //mapping s in string and char in pattern 
        if(!map2.containsKey(stringArr[i])) {
          map2.put(stringArr[i], charArr[i]);
          
        } else{
          if(!map2.get(stringArr[i]).equals(charArr[i])) {
            System.out.println("x:"+map2.get(stringArr[i])+":"+ charArr[i]);
            return false;
          }
        }
      }
      return true;
    }
}