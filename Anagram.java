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

    private static int calculateHash(String str){
        int hash = 0;
        for (int i = 0; i < str.length(); i++) {
            hash += str.charAt(i);
        }
        return hash;
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer, List<String>> map = new HashMap<>();
        for(String str : strs){
            int hash = calculateHash(str);
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
