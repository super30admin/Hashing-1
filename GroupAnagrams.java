import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    // Time Complexity = O(nk), where n is the avg length of a string and k is number of strings
    // Space Complexity = O(nk), where n is the avg length of a string and k is number of strings


    // prime numbers
    int[] primeNumbers = {
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
            101, 103, 107, 109, 113, 127, 131, 137, 139, 149
    };
    // Create an array of small case letters
    char[] lowercaseLetters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm','n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        // null check
        if(strs == null || strs.length == 0) return result;

        // create a map of prime number and char
        Map<Character, Integer> charPrimeMap = new HashMap<>();
        for(int i = 0; i < lowercaseLetters.length; i++){
            charPrimeMap.put(lowercaseLetters[i], primeNumbers[i]);
        }
        // now our char -> prime number map ready
        Map<Double, List<String>> resultMap = new HashMap<>();
        for(String s: strs){
            double hash = calculateHash(s, charPrimeMap);
            if(!resultMap.containsKey(hash)){
                // put
                resultMap.put(hash, new ArrayList<String>());
            }
            resultMap.get(hash).add(s);
        }

        // now lets create result
        for(List<String> strList: resultMap.values()){
            result.add(strList);
        }
        return result;
    }

    public Double calculateHash(String word, Map<Character, Integer> map) {
        double hash = 1;
        for(int i = 0; i < word.length(); i++){
            hash = hash * map.get(word.charAt(i));
        }
        return hash;
    }
}
