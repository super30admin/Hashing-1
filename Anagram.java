// Time Complexity : O(n*k)
// Space Complexity : O(n) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagram {
    int [] prime;
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s : strs)
        {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = String.valueOf(charArray);
            if(!map.containsKey(sorted))
            {
                map.put(sorted,new ArrayList<String>());
            }
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public List<List<String>> groupAnagramsPrimeProduct(String[] strs) {
        Map<Double,List<String>> map = new HashMap<>();
        this.prime = new int[] {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,67,71,73,79,83,89,97,101,
            103};
        for(String s : strs)
        {
            double primeProduct = getPrimeProduct(s);
            if(!map.containsKey(primeProduct))
            {
                map.put(primeProduct,new ArrayList<String>());
            }
            map.get(primeProduct).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public double getPrimeProduct(String s)
    {
        double result =1;
        for(int i=0;i< s.length(); i++)
        {
            char c =s.charAt(i);
            result = result *prime[c-'a'];
        }
        return result;

    }

    public static void main(String[] args)
    {
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        Anagram a = new Anagram();
        //System.out.println(a.groupAnagrams(str).toString());
         System.out.println(a.groupAnagramsPrimeProduct(str).toString());

    }
}
