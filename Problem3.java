// Time Complexity : O(n) 
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
//Hash map is created with matching each letter in the first string with the respective string after spliting with spaces
//in the second string. Returns false if the letters are not matching in the iteration, returns true in case of sucess

class Solution {
    public boolean wordPattern(String pattern, String s) {
         String[] words = s.split(" ");
         Map<Character,String> map = new HashMap<Character,String>();
         if(pattern.length() != words.length) return false;
         for(int i=0;i<pattern.length();i++){
            if(map.containsKey(pattern.charAt(i))&& map.get(pattern.charAt(i)).equals(words[i])){
                continue;
            }else if(!map.containsKey(pattern.charAt(i)) && !map.containsValue(words[i])){
                 map.put(pattern.charAt(i),words[i]);
            }else{
                return false;
            }
        }
        return true;
    }
}