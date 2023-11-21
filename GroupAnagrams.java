//T.C O(n)
//S.C O(1)
// Did this code successfully run on Leetcode : yes (https://leetcode.com/problems/group-anagrams/)
// Any problem you faced while coding this : -

import java.util.*;

//Given an array of strings, group anagrams together.
//Sol: For each of strings in array, sort the characters and add to hashmap as key
//if the key already exists, append the new string to existing list
//Return map values
public class GroupAnagrams {

    public List<List<String>> groupAnagramPrimes(String[] strs) {
        int[] primes = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        Map <Integer, List<String>> res = new HashMap<>();
        for (String i : strs) {
            char[] ch = i.toCharArray(); //change str to char array
            int prod = 1;
            for(char c:ch){
                prod = prod*primes[c-'a'];
            }
            if(!res.containsKey(prod))
                res.put(prod, new ArrayList<>());
            res.get(prod).add(i);


        }
        return new ArrayList<>(res.values());
    }

    public static void main(String args[]) {
        //String[] strs = new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab"};
        String[] strs = new String[]{"ab","aa"};
        System.out.println(new GroupAnagrams().groupAnagramPrimes(strs));
    }



    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> hm = new HashMap<>();
        for(String s : strs){ //O(n)

            char[] chars=s.toCharArray();
            Arrays.sort(chars); //O(klog k)
            String key = String.valueOf(chars);

            if (!hm.containsKey(key)) {
                hm.put(key, new ArrayList<>());
            }
            hm.get(key).add(s);

        }
        return new ArrayList<>(hm.values());
    }
}
