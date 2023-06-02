import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)
            return new ArrayList<>();
        HashMap<Double, ArrayList<String>> map = new HashMap<>();
        for (String word : strs) {
            double pp = productCalculator(word);
            if (!map.containsKey(pp)) {
                map.put(pp, new ArrayList<>());
            }
            map.get(pp).add(word);
        }
        return new ArrayList(map.values());
    }

    public double productCalculator(String str) {
        int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53,
                59, 61, 67, 71, 73, 79, 83, 89, 97,
                101 };

        double pp = 1d;
        for (char ch : str.toCharArray()) {
            pp *= primes[ch - 'a'];
        }
        // System.out.println(pp);
        return pp;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        String[] arr = { "eat", "tea", "tan", "ate", "nat", "bat" };
        System.out.println("Values are: " + obj.groupAnagrams(arr));
    }
}