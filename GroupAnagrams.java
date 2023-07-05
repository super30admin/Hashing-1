// Time Complexity : O(nk)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams
{

    static int[] primeArr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67,
                                        71, 73, 79, 83, 89, 97, 101};
    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<Double, List<String>> anagramsMap = new HashMap<>();

        if(strs == null || strs.length == 0) return null;

        for(String st : strs)
        {
            double hashCode = getHashCode(st);
            if (!anagramsMap.containsKey(hashCode))
            {
                anagramsMap.put(hashCode,new ArrayList<>());
            }
            anagramsMap.get(hashCode).add(st);
        }
        return new ArrayList<>(anagramsMap.values());
    }

    public static double getHashCode(String str)
    {
        double hashCode = 1d;
        for (char c:str.toCharArray())
        {
            int primeCode = 0;
            primeCode = primeArr[c-'a'];
            hashCode = hashCode * primeCode;
        }
        return hashCode;
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}
