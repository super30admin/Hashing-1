/**
Leetcode problem 205: Isomorphic Strings

Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

Time Complexity : O(N)
Space Complexity : O(1) 
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

**/

class Solution 
{
    public boolean isIsomorphic(String s, String t) 
    {
        
        
        if(s.length() != t.length())
            return false; 
            
            Map<Character, Character> firstMap = new HashMap<>();
            Map<Character, Character> secondMap = new HashMap<>();
            
        for(int i=0; i < s.length(); i++)
        {
        
            char char1 = s.charAt(i);
            char char2 = t.charAt(i);
            
            if( firstMap.containsKey(char1))
            {    
            
                char value = firstMap.get(char1);
                
                if( value != char2 )
                    return false;
            }else 
            {
                firstMap.put( char1, char2);   
            }
            
            if( secondMap.containsKey(char2))
            {    
            
                char value = secondMap.get(char2);
                
                if( value != char1 )
                    return false;
            }else 
            {
                secondMap.put( char2, char1);   
            }
        
        }
        
        return true;
    }
}