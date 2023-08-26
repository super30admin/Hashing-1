import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)
            return new ArrayList<>();
        HashMap<Double, ArrayList<String>> map = new HashMap<>();
        for (String str : strs) {
            double primeProduct = getPrimeProduct(str);
            if (!map.containsKey(primeProduct)) {
                map.put(primeProduct, new ArrayList<>());
            }
            map.get(primeProduct).add(str);
        }
        return new ArrayList<>(map.values());

    }

    private static double getPrimeProduct(String str) {
        int[] prime = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
                101,
                103 };
        double result = 1d;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int pr = prime[ch - 'a'];
            result = result * pr;
        }
        return result;
    }

    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        System.out.println(groupAnagrams(strs));
    }
}
