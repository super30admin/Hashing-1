// TC: O(nk)
// SC: O(nk)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> result = new ArrayList<>();
        if (strs == null || strs.length == 0) return result;
        HashMap<Double, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];
            double prime = prime(s);

            if (!map.containsKey(prime)) {
                map.put(prime, new ArrayList<>());
            }
            map.get(prime).add(s);
        }

        return new ArrayList<>(map.values());
    }

    private double prime(String s) {
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
        double result = 1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            result = result * primes[c - 'a'];
        }

        return result;
    }
}
