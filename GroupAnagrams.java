// Time Complexity : O(n * m ) [n: elements in strs array; m: characters of each str in the strs array]
// Space Complexity : O(n * m)
// Did this code successfully run on Leetcode : yes

// Any problem you faced while coding this : Yes, I was getting TLE Initially i was using Brute force with nested for loops

// Your code here along with comments explaining your approach in three sentences only
/**
 * Intialized hashMap
 * Iterated the array and calculated primeproducts Hashing for each char in the string 
 * Key is primeproducts and value is ArrayList
 * Added key if not present and then added the string in the arraylist
 */

// Java code to implement the approach

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length <= 1) {
            return Arrays.asList(Arrays.asList(strs));
        }

        List<List<String>> listOfAnagramsList = new ArrayList<>();

        // Map<String, List<String>> hmap = new HashMap<>();
        Map<Double, List<String>> hmap = new HashMap<>();

        for (String str : strs) {

            // String sortedString = convertStringToSortedString(str);
            double primeProducts = primeProducts(str);

            // hmap.putIfAbsent(sortedString, new ArrayList<>());
            // hmap.get(sortedString).add(str);
            hmap.putIfAbsent(primeProducts, new ArrayList<>());
            hmap.get(primeProducts).add(str);
        }

        listOfAnagramsList.addAll(hmap.values());
        return listOfAnagramsList;
    }

    private String convertStringToSortedString(String str) {
        return str.chars().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
    }

    private String sortByArrayMethod(String str) {
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }

    private String sortByComparator(String str) {
        Character[] charArr = new Character[str.length()];

        for (int i = 0; i <= str.length() - 1; i++) {
            charArr[i] = str.charAt(i);
        }

        Arrays.sort(charArr, (c1, c2) -> (c1 - c2));

        StringBuilder sb = new StringBuilder(charArr.length);
        for (char ch : charArr) {
            sb.append(ch);
        }

        return sb.toString();
    }

    private int[] generateNPrimeNUmbersArray(int n) {

        int primeArray[] = new int[n];

        if (n == 0) {
            return primeArray;
        }

        primeArray[0] = 2;
        int counter = 1;

        if (n == 1) {
            return primeArray;
        }

        int idx = 0;
        int j = 3;
        while (counter < n) {

            if (isPrime(j)) {
                primeArray[++idx] = j;
                counter++;
            }

            j += 2;
        }

        return primeArray;
    }

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        } else {
            for (int i = 3; i <= Math.sqrt(n); i += 2) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    private double primeProducts(String s) {
        double result = 1;
        // int primeArray[] = generateNPrimeNUmbersArray(27);
        int primeArray[] = new int [] {2, 3, 5, 7, 11,
            13, 17, 23, 29, 31,
            37, 41, 43, 47, 53,
            59, 61, 67, 71, 73,
            79, 83, 89, 97, 101,
            103};
        for(int i = 0; i <= s.length() - 1; i++) {
            char c = s.charAt(i);
            result *= primeArray[c - 'a'];
        }
        return result;
    }
}
