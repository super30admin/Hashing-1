/**
290. Word Pattern

Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

Input: pattern = "abba", s = "dog cat cat dog"
Output: true

Time Complexity : O(N)
Space Complexity : O(1) 
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Collabedit: http://collabedit.com/mqhfh

**/

class Solution 
{
    private final int[] primes = {2,3,5,7,11,13,17,23,29,31,37,41,43,47,53,57,59,61,67,71,73,79,83,87,91,97,101,103,107};
    
    public boolean wordPattern(String pattern, String s) 
    {
        // Splitting the string by space
        String inputs[] = s.split(" ");
        
        if(inputs.length != pattern.length()) 
            return false;
        
        Map<Long, Character> hashMap1 = new HashMap<>();
        Map<Character, Long> hashMap2 = new HashMap<>();
        
        int index = 0;
        
        for(String input: inputs)
        {
            char charAtIndex = pattern.charAt(index++);
            long primeProduct = this.primeProduct(input);
            
            if( hashMap1.containsKey(primeProduct) )
            {
                char previousChar = hashMap1.get(primeProduct);
                
                if( previousChar != charAtIndex)
                    return false;
            
            }
            else
            {
                hashMap1.put(primeProduct, charAtIndex);
            }
            
            if( hashMap2.containsKey(charAtIndex) )
            {
                long previousPrimeProduct = hashMap2.get(charAtIndex);
                
                if( previousPrimeProduct != primeProduct)
                    return false;
            
            }
            else
            {
                hashMap2.put(charAtIndex, primeProduct);
            }
        
        }
        
        return true;
        
    }
    
    private long primeProduct(String input)
    {
        long result = 1;
        
        for(int i=0;i < input.length(); i++)
        {
            char current = input.charAt(i);
            
            int primeInt = this.primes[current -'a'];
          
            result = result * primeInt;
        
        }
        
        return result;
    
    }
}