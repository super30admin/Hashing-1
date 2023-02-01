import java.util.*;

//time: O(n)
//space: O(1)
public class Problem1 {

    static List<List<String>> getAnagrams(String[] tokens) {

        Map<Double, List<String>> anagrams = new HashMap<>();

        for (String token: tokens){
            double primeProduct = getPrimeProduct(token);

            if (!anagrams.containsKey(primeProduct)) {
                anagrams.put(primeProduct, new ArrayList<>());
            }
            anagrams.get(primeProduct).add(token);
        }
        return new ArrayList<>(anagrams.values());
    }

    static double getPrimeProduct(String inputString) {

        double res = 1;
        int[] primes = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        for (int i=0;i<inputString.length();i++){
            char temp = inputString.charAt(i);
            int prime = primes[temp-'a'];
            res = res*prime;
        }
        return res;
    }

    public static void main(String[] args){
        System.out.println("grouped anagrams "+getAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
}
