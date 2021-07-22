// Time Complexity : O(N) where N = length of the String s
// Space Complexity : O(N). HashMap.
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : None.


class Solution {
    public boolean wordPattern(String pattern, String s) {
        // split the string at spaces to get array 
        String[] arr = s.split(" ");
        
        if(arr.length != pattern.length())
        {
            return false;
        }
        
        Map<Character, String> patToStrMap = new HashMap<>();
        Map<String, Character> strToPatMap = new HashMap<>();

        //Map the elements of array to characters in pattern
        // n same logic as isomorphic strings
        for(int i = 0; i < arr.length; i++)
        {
            String st = arr[i];
            Character pt = pattern.charAt(i);
            
            if(!strToPatMap.containsKey(st))
            {
                strToPatMap.put(st, pt);
            }
            
            if(!patToStrMap.containsKey(pt))
            {
                patToStrMap.put(pt, st);
            }
            
            if(patToStrMap.get(pt).equals(st) == false || strToPatMap.get(st).equals(pt) == false)
            {
                return false;
            }
        }
        
        return true;
    }
}