// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public boolean wordPattern(String pattern, String s) {

        if(pattern == null || s==null) return false;

        String[] arr = s.split(" ");
        if(pattern.length()!=arr.length) return false;
        HashMap<Character, String> patternMap = new HashMap<>();
        HashMap<String,Character> sMap = new HashMap<>();

        for (int i=0; i<pattern.length();i++)
        {
            if(patternMap.containsKey(pattern.charAt(i)))
            {
                if(!patternMap.get(pattern.charAt(i)).equals(arr[i]))  
                return false;
            }
            else
                patternMap.put(pattern.charAt(i),arr[i]);
            

            if(sMap.containsKey(arr[i]))
            {
                if(sMap.get(arr[i]) != pattern.charAt(i))  
                return false;
            }
            else
                sMap.put(arr[i],pattern.charAt(i));
            
        }
       return true; 
    }
}