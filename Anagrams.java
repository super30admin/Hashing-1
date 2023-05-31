import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
// Time complexity o(n) and Space Complexity o(n)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)
            return new ArrayList<>();
        
        HashMap<Double, ArrayList<String>> map = new HashMap<>();
        
        for (String str : strs) {
            double hash = hashStrings(str);
            
            if (!map.containsKey(hash)) {
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                map.put(hash, list);
            } else {
                map.get(hash).add(str);
            }
        }
        
        return new ArrayList<>(map.values());
    }
    
    public double hashStrings(String str) {
        int[] primeNumbers = {
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103
        };
        
        double result = 1d;
        
        for (int i = 0; i < str.length(); i++) {
            char p = str.charAt(i);
            int prime = primeNumbers[p - 'a'];
            result = prime*result;
        }
        
        return result;
    }
}
