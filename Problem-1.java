import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


// Time Complexity: O(nk) where n is the length of strs array & k is length of each string
//Space Complexity: O(n)
class Solution {
    int[] prime;
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs == null || strs.length == 0) return new ArrayList<>();
        this.prime = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};

        HashMap<Double, List<String>> map = new HashMap<>();

        for(String str: strs) {
            double product = primeProduct(str);

            if(!map.containsKey(product)) {
                map.put(product, new ArrayList<>());
                
            }
            map.get(product).add(str);
        }
        return new ArrayList<>(map.values());
    
    }

    private double primeProduct(String str) {

        double result = 1d;
        for(int i = 0; i<str.length(); i++) {
            char sChar = str.charAt(i);

            result = result * prime[sChar - 'a'];
        }
        return result;
    }
}