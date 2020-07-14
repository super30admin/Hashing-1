// Time Complexity : O(nk)
//      n: number of words 
//      k: length of a word
// Space Complexity: O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : multiplying factor like how to make it unique


// Your code here along with comments explaining your approach
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

class Problem1 {

    /** finds group of anagrams */
    public List<List<String>> groupAnagrams(String[] strs) {

        // Prime number approach ~ multiplying prime number is always unique
        int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
                              31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
                              73, 79, 83, 89, 97, 101};

        // hashmap to store the words into group                      
        HashMap<Long, List<String>> map = new HashMap<>();

        // Iterate all the words
        for(String word:strs){
            
            // calcualte hashcode for each word
            Long calKey = calculateCode(word, primeNumbers);
            // if does not contain the calculated code intialize 
            if(!map.containsKey(calKey))
                map.put(calKey, new ArrayList<String>());
            // add to Array list    
            map.get(calKey).add(word);   
        }
        
        // return List of List<String>
        return new ArrayList<>(map.values());
    }
    
    /** calcaulates hash code of each word */
    private Long calculateCode(String word, int[] primeNumbers){

        // requires long (Integer overflow)
        Long result = Long.valueOf(1);

        // iterate all the charaters of word
        for(int i=0;i<word.length(); i++)
            result *= primeNumbers[word.charAt(i)-'a'];  // subtract 'a' makes charater index 'a' == 0
        
        return result;
        
    }
}