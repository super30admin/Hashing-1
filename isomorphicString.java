// Time Complexity : O(N) as we are looping through the whole length of both the strings which are of equal size.
// Space Complexity : O(N) as I have used both hashmap and hashset
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Same as pattern matching


// Your code here along with comments explaining your approach: Same as pattern matching

class Solution {
       public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length())
            return false;
        
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        
        for(int i=0; i < s.length(); i++){
                if(map.containsKey(s.charAt(i))){
                    System.out.println("character at s is: " + s.charAt(i));
                    System.out.println("character at t is: " + t.charAt(i));
                    if(map.get(s.charAt(i)) != t.charAt(i)) return false;
                }else{
                    if(!set.contains(t.charAt(i))){
                      map.put(s.charAt(i), t.charAt(i));  
                       set.add(t.charAt(i)); 
                    }else{
                        return false;
                    }
                    
                }
        }
        
        return true;
    }
}