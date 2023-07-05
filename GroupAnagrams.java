import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        if (null == strs || strs.length == 0)
            return new ArrayList<>();
        Map<Double, List<String>> map = new HashMap<>();

        for (String str : strs) {
            double primeProduct = findPrimeProduct(str.toCharArray());
            if (!map.containsKey(primeProduct)) {
                map.put(primeProduct, new ArrayList<>());
            }
            map.get(primeProduct).add(str);
        }

        return new ArrayList<>(map.values());

    }

    private double findPrimeProduct(char[] charArray) {
        int prime[] = new int[] { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79,
                83, 89, 97, 101, 103 };
        double result = 1d;
        for (int i = 0; i < charArray.length; i++) {
            result = result * prime[charArray[i] - 'a'];
        }
        return result;
    }

}
