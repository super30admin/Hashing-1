/*
Time Complexity : O(n*len(word))
Space Complexity : O(n) all words are again saved

Did this code successfully run on Leetcode :
Finished in 98 ms
[tan, nat]
[bat]
[eat, tea, ate]

Any problem you faced while coding this :
Hashing Mechanism should be better. If the sum is same. it will hash the same.

Your code here along with comments explaining your approach :
Straight forward approach.
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagram {
    static final int[] primeNums = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 67, 71, 73, 79, 83, 89, 97, 101, 103};
    private static double calculateHash(String str){
        double hash = 1;
        for (int i = 0; i < str.length(); i++) {
            hash *= primeNums[str.charAt(i) - 'a'];
        }
        return hash;
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<Double, List<String>> map = new HashMap<>();
        for(String str : strs){
            double hash = calculateHash(str);
            
            map.computeIfAbsent(hash, k->new ArrayList<>());
            map.get(hash).add(str);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> output = groupAnagrams(strs);
        for(List i : output){
            System.out.println(Arrays.toString(i.toArray()));
        }
        
    }
}
