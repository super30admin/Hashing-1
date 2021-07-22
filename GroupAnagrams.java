import java.util.*;

// Time Complexity : O(N * W) where N = size of the array and W = average word length.
// Space Complexity : O(N). HashMap.
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : None.


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>();
        Map<Long, List<String>> anagramsMap = new HashMap<>();
        
        for(String s: strs)
        {
            //For every String calculate hash
            // use that hash as key and add this string ain the list associated with this key
            long hash = calculateHash(s);
            List<String> li = anagramsMap.getOrDefault(hash, new ArrayList<String>());
            li.add(s);
            anagramsMap.put(hash, li);
        }
        
        // Get lists associated with every key
        // Add the list in answers list
        for(Long key: anagramsMap.keySet())
        {
            answer.add(anagramsMap.get(key));
        }
        
        return answer;
    }
    
    private static final int[] PRIMES = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 
                                        31, 37, 41, 43, 47, 53, 59, 61, 67,71,
                                        73, 79, 83, 89, 97, 101};
    
    private long calculateHash(String s)
    {
        char[] arr = s.toCharArray();
        
        long hash = 1;
        
        for(Character ch: arr)
        {
            hash = hash * PRIMES[ch - 'a'];
        }
        
        return hash;
    }
}