// Time Complexity : O(nklog(k))
// Space Complexity : O(nk) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map=new HashMap<>(); // to store sorted string.
        for(String str: strs){//O(nklogk); where k= avg len of string 
            char[] charArr= str.toCharArray(); 
            Arrays.sort(charArr); //sort string characters: nlogn
            
            String sorted= String.valueOf(charArr); //sorted character array to string.
            if(!map.containsKey(sorted)){ //check if map containsKey sorted string.O(k)
                map.put(sorted, new ArrayList<>()); // if no then add the string with empty list in map.
            }
            map.get(sorted).add(str); // add current string to list.
        }
        return new ArrayList<>(map.values()); /// return new list of list(map.values).O(n)
    }

    public static List<List<String>> primeProductAnagrams(String[] strs) {
        
        HashMap<Double, List<String>> map=new HashMap<>(); 
        for(String str: strs){
            double primeProduct = primeNumbersBruteForce(str);

            if(!map.containsKey(primeProduct)){ //check if map containsKey 
                map.put(primeProduct, new ArrayList<>()); 
            }
            map.get(primeProduct).add(str); // add current string to list.
        }
        return new ArrayList<>(map.values()); /// return new list of list(map.values)
    }

    public static double primeNumbersBruteForce(String s) {
    int[] primes  =  {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
    double result = 1;
    for (int i = 0; i < s.length(); i++) {
        
            char c =s.charAt(i); //a ; b 
            int prime = primes[c - 'a']; //97-97=0; 98-97=1
            result *= prime;
    }
    return result;
}

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println("using map by sorting the string:");
        System.out.println(groupAnagrams(strs));
        System.out.println("using map by primeproduct of the char in the string:");
        System.out.println(primeProductAnagrams(strs));


    }
}