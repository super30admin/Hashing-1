// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode : No
// Any problem you faced while coding this : Duplicate values being mapped to unique keys in hashmap


// Your code here along with comments explaining your approach

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length()!=t.length())
            return false;
        
        HashMap<Character, Character> map = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            //if(map.containsKey(s.charAt(i)))
           // System.out.println("s="+s.charAt(i)+" t="+t.charAt(i));
            
            if(map.containsValue(t.charAt(i)) && !map.containsKey(s.charAt(i))){
                System.out.println("index="+i);
                map.put(s.charAt(i),'@');
                System.out.println(map.get(s.charAt(i)));
            }
            else
                map.put(s.charAt(i), t.charAt(i));
        }
        System.out.println(map);
        for(int i=0; i<s.length(); i++){
            if(map.get(s.charAt(i))!=t.charAt(i)){
              //  System.out.println(s.charAt(i)+" "+t.charAt(i));
                return false;
            }
        }
        
        return true;
    }
}


