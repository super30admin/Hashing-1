// Time Complexity : O(Nk)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double, List<String>> map = new HashMap<>();
        for(String s: strs) { //O(nk)
            double primePro = primeProduct(s); //O(K)
            if(!map.containsKey(primePro)) {
                map.put(primePro, new ArrayList<>());
            }
            map.get(primePro).add(s);
        }
        return new ArrayList<>(map.values()); //O(n)
    }

    private double primeProduct(String s) {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        double res = 1;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int prime = primes[c -'a'];
            res *= prime;
        }
        return res;
    }
}


// HashMap<String, List<String>> map = new HashMap<>();
//         for(String s: strs) { //O(nklogK)
//             char[] charArr = s.toCharArray();
//             Arrays.sort(charArr);
//             String sorted = new String(charArr); //String.valueOf(charArr)
//             if(!map.containsKey(sorted)) {
//                 map.put(sorted, new ArrayList<>());
//             }
//             map.get(sorted).add(s);
//         }
//         return new ArrayList<>(map.values()); //O(n)