// Time Complexity : O(N) inserting all elements of both strings into hashmap and 1 string into hashset
// Space Complexity : O(N) used hashmap and hashset
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : I could take care of test case having repeated characters only after using hashset.


// Your code here along with comments explaining your approach
//I used hashmap to map key value pairs. Hashset to keep track of repeated values stored in HashMap.


class Solution {
    public boolean wordPattern(String pattern, String str) {
       if(pattern == null || str == null)
            return false;
        
        String[] word = str.split("\\s+");
        System.out.println(word.length);
        
        if(pattern.length() != word.length)
            return false;
        
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        
        for(int i=0; i<pattern.length(); i++){
            if(map.containsKey(pattern.charAt(i))){
                System.out.println(map.get(pattern.charAt(i)));
                System.out.println(word[i]);
                if(!map.get(pattern.charAt(i)).equals(word[i])){
                    return false;
                } 
            }else{
                if(!set.contains(word[i])){
                    System.out.println("Key entered:" + pattern.charAt(i));
                    System.out.println("Value entered: " + word[i]);
                    map.put(pattern.charAt(i), word[i]); 
                    set.add(word[i]);
                }else{
                    return false;
                }

            }
        }
        
        return true;
    }
}
