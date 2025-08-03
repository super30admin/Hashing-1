/**Time Complexity: O(N * K) where N is the number of strings and K is the maximum length of a string. 
 * Space Complexity: O(N * K) for the hashmap storing the anagrams.
 * Did this code successfully run on Leetcode? Yes
 * Any problems faced? No
 */

/* The hash value is calculated using prime numbers assigned to each character to ensure that each letter combination generates a different hash value to minimize collisions.
 * The Hashmap has the unique hash value as the key and a list of anagrams as the value.
 * Here the time complexity is optimized by using prime numbers to calculate the hash value for each word, instead of sorting the strings which adds an overhead of O(K log K) for each string.
 */



import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
class groupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
    HashMap <Double,List<String>> Anagramgroups=new HashMap<>();

        for(String Word: strs)
        {
             double HashValue=HashValue(Word);

            if(!Anagramgroups.containsKey(HashValue))
            {
                Anagramgroups.put(HashValue,new ArrayList<String>());
            }

            Anagramgroups.get(HashValue).add(Word);

            


        }
         return  new ArrayList<>(Anagramgroups.values());
    

        
    }
    public double HashValue(String Word)
    {
        int[] primeHashvalue=new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47,53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101};
         char[] Chararray=Word.toCharArray();
         double Hashvalue=1;

         for (char c : Chararray)
         {
             Hashvalue=Hashvalue*primeHashvalue[c-'a'];
         }
         return Hashvalue;

    }





}
