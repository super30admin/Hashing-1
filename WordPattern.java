/**

Time Complexity : O(N)
Space Complexity : O(N) 
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

**/
class Solution 
{
    public boolean wordPattern(String pattern, String s) 
    {
                
        String inputArr[] = s.split(" ");
        
        if(pattern.length() != inputArr.length)
        {
            return false;
        }
        
        Map<Character, String> pmap = new HashMap<>();
        Map<String, Character> smap = new HashMap<>();
        
        int length = inputArr.length;
        
        for(int i =0; i < length; i++)
        {
            
            char currentChar = pattern.charAt(i);
            String currentString = inputArr[i];
            
            boolean charExists = pmap.containsKey(currentChar);
            
            if(charExists)
            {
                if(!pmap.get(currentChar).equals(currentString))
                {
                    return false;
                }
            }
            else
            {
                pmap.put(currentChar, currentString);
            }
            
            boolean stringExists = smap.containsKey(currentString);
            
            if(stringExists)
            {
                if(smap.get(currentString) != currentChar)
                {
                    return false;
                }
            }
            else
            {
                smap.put(currentString, currentChar);
            }
            
        }
        
        return true;
    }
}