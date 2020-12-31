/**
    Leetcode Problem: 49 Group Anagrams
    Level Medium
    
    Given an array of strings strs, group the anagrams together. You can return the answer in any order.

    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using
     all the original letters exactly once.
     
    Input: strs = ["eat","tea","tan","ate","nat","bat"]
    Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
    

As mentioned in the question the input always consist of lowercase letters
Allocate a prime number to each alphabet


Time Complexity : O(N)
Space Complexity : O(1) 
Did this code successfully run on Leetcode : No
Any problem you faced while coding this : No


The code failed for a the last test case having very large input

Collabedit: http://collabedit.com/h29bd

**/

class Solution 
{

    private final int[] primes = {2,3,5,7,11,13,17,23,29,31,37,41,43,47,53,57,59,61,67,71,73,79,83,87,91,97,101,103,107};
    
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        
        Map<Long, List<String>> hashMap = new HashMap<>();
        
        for(String str: strs)
        {
            // compute the primesum of each input string and store the string against the sum in the hashmap
            long primeSum = this.primeSum(str);
             
            if( hashMap.containsKey(primeSum) )
            {
                List<String> currentList = hashMap.get(primeSum);
                currentList.add(str);
                hashMap.put(primeSum, currentList);
            }
            else
            {
                hashMap.put(primeSum, new ArrayList<>(Arrays.asList(str)));
            }
        }
        
        List<List<String>> output = new ArrayList<>();
        
        // traverse over the key set and add the values(anagrams grouped) to the output list
        
        for(Long primeSum: hashMap.keySet() )
        {
            output.add(hashMap.get(primeSum));
        }
        
        return output;
            
    }
    
    private long primeSum(String input)
    {
        long result = 1;
        
        for(int i=0;i < input.length(); i++)
        {
            long primeValue = this.primes[input.charAt(i) - 'a'] ;
            result = result * primeValue;
        }
        
        return result;
    }
}