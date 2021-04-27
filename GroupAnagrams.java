// Assuming k is the size of the words.
// Time Complexity : O(nk)
// Space Complexity : O(nk)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * We compute the id of the words based on the characters.
 * For every word which has same characters irrespective of the order, the id will remain same.
 *    1. We can compute the id by associating a prime number to each and every character 
 *       and take corresponding product of all the characters in the word.
 *    2. We can do a summation of all the asci values in the string to generate the id.
 * If the incoming word id is present in the map, then we add the word to the corresponding bucket in the map.
 * If the incoming word is a new word, then we create a new bucket with the associated id.
 * In the end return the values which are grouped.
*/

import java.util.*;

class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs == null || strs.length == 0) return new ArrayList<>();
        
        HashMap<Long, List<String>> map = new HashMap<>();
        
        for(String s: strs){
            long primeProd = primeProduct(s);
            
            if(!map.containsKey(primeProd)){
                map.put(primeProd, new ArrayList<>());
            }
            
            map.get(primeProd).add(s);
        }
        
        return new ArrayList<>(map.values());
    }
    
    private static long primeProduct(String s){
        long result = 1;
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109};
        
        for(char c: s.toCharArray()){
            result *= primes[c - 'a'];
        }
        return result;
    }

    public static void main(String[] args) {
        String[] input = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> anagrams = groupAnagrams(input);
        int i = 1;
        for(List<String> group: anagrams){
            System.out.print("Group"+i+": ");
            for(String s: group){
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }
}