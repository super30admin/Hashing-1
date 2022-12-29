import java.util.HashMap;

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// Approach 1: In this approach we use two hashmap to store patter to s mapping and s -> pattern mapping. Firstly we check for pattern, 
//If the key is not present in pmap we add a new key with values from S.
//If it is there we check its value. If is not equal to string in S we return false. We repeat the same for S.

class Solution {
    public boolean wordPattern(String pattern, String s) {
        if(s == null || pattern == null) return false;
        if(s == null && pattern == null) return true;

        HashMap<Character,String> pmap = new HashMap<>(); //will store O(1) because at max 26
        HashMap<String,Character> smap = new HashMap<>(); //will store O(1)

        String[] arrOfStr = s.split(" "); //will store O(1) because at max 26

        if(pattern.length() != arrOfStr.length) return false; //Time- O(n)
        
        for(int i=0;i<pattern.length();i++){
            char pchar = pattern.charAt(i);

            if(pmap.containsKey(pchar)){
                if(pmap.get(pchar).equals(arrOfStr[i]) == false) return false;
            }else{
                pmap.put(pchar,arrOfStr[i]);
            }

            if(smap.containsKey(arrOfStr[i])){
                if(smap.get(arrOfStr[i]).equals(pchar) == false) return false;
            }else{
                smap.put(arrOfStr[i],pchar);
            }
        }

        return true;

    }
}
