// Time Complexity : n( k log k) //beacuse sorting before adding
// Space Complexity : O(1)
// Did this code successfully run on LeetCode : Yes
// Any problem you faced while coding this : No


//Approach - For each string in strs array,  sort it.  Create a HashMap with element as key and List of anagrams for that
// string as ArrayList.  Check if the map contains the same string as key then add it to the list.  If key does not exist
// create  an entry using the string element as key and create new ArrayList as value.  then Add the anagram to the list
//for that particular key by using get operation on the HashMap.

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        int arrSize = strs.length;
        Map<String, List<String>> anagramsGroup = new HashMap<>();

        for(int i = 0; i<arrSize; i++){
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String sortedStr = String.valueOf(charArray);
            if(!anagramsGroup.containsKey(sortedStr)){
                anagramsGroup.put(sortedStr, new ArrayList<>());
            }
            anagramsGroup.get(sortedStr).add(strs[i]);

        }
        return new ArrayList<>(anagramsGroup.values());
    }

    static int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103};

    public static final double primeProduct(String s){

        double result = 1;
        for(int i =0; i < s.length(); i++){
            char c = s.charAt(i);

            result = result * primes[c - 'a'] ;
        }
        return result;
    }

    //Time complexity = O(nk);  // no sorting instead primeproduct applied as key.
    //Space complexity = O(1);
    public static List<List<String>> groupAnagramsWithoutSorting(String[] strs) {
        int arrSize = strs.length;
        Map<Double, List<String>> anagramsGroup = new HashMap<>();

        for(int i = 0; i<arrSize; i++){
            String s = strs[i];
            double primeProduct = primeProduct(s);

            if(!anagramsGroup.containsKey(primeProduct)){
                anagramsGroup.put(primeProduct, new ArrayList<>());
            }
            anagramsGroup.get(primeProduct).add(strs[i]);

        }
        return new ArrayList<>(anagramsGroup.values());
    }
    public static void main(String[] args){
       String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> anagramsGroup1 = groupAnagrams(strs);

        String[] emptyArr = {""};
        List<List<String>> anagramsGroup2 = groupAnagrams(emptyArr);
        String[] s = {"a"};
        List<List<String>> anagramsGroup3 = groupAnagrams(s);
    }
}
