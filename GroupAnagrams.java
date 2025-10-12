import java.math.BigInteger;
import java.util.*;

/**
 * Use consistent hashing to get the same result for combinations of same letter to group them in same bucket.
 * Time Complexity is O(n) for hash iteration and o(n) for length of the input array.
 */
public class GroupAnagrams {

    private static final int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};

    List<List<String>> solve(String[] inputs) {
        Map<BigInteger, List<String>> categorise = new HashMap<>();
        for (String input : inputs) {
            BigInteger hashCode = new StringWrapper(input).hashCode1();
            List<String> strings = categorise.get(hashCode);
            if (strings == null) {
                strings = new ArrayList<>();
                categorise.put(hashCode, strings);
                strings.add(input);
            } else strings.add(input);
        }
        return new ArrayList<>(categorise.values());
    }

    public static void main(String[] args) {
        Collection<List<String>> solve = new GroupAnagrams().solve(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        System.out.println(solve);
    }

    static class StringWrapper {
        String input;

        StringWrapper(String input) {
            this.input = input;
        }


        public BigInteger hashCode1() {
            BigInteger sum = BigInteger.ONE;
            for (char c : input.toCharArray()) {
                int idx = c - 'a';
                sum = sum.multiply(BigInteger.valueOf(prime[idx] * c));
            }
            return sum;
        }
    }
}
