// Time complexity: O(n*k) where n = number of elements and k is average length of each element. Reason: We are iterating over the list and then
// iterating over each string to get the prime product
// Space complexity: O(n*k) where n is the number of strings and k = average length of string.
/* Approach: Product of prime numbers is unique! So, if we map each character from a-z to a prime number. Product of bat and tab should be the same.
* Using this logic, we iterate the strings and if the prime product does not exist in the hashmap, we store it using the prime product as the key.
* If the key already exists, we append the string to the array. Hence, resulting in group of anagrams. 
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class GroupAnagrams {
    // first 26 prime numbers
    int[] primeNumbers = new int[] { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79,
            83, 89, 97, 101 };

    public List<List<String>> groupAnagrams(String[] strs) {
        // using double as primeProduct of a long string can result in integer overflow
        HashMap<Double, ArrayList<String>> map = new HashMap<Double, ArrayList<String>>();

        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            double primeProduct = primeProduct(str);
            // if primeProduct exists in the array that means there is an anagram for the -
            // - current string
            if (map.containsKey(primeProduct)) {
                map.get(primeProduct).add(str);
            } else {
                map.put(primeProduct, new ArrayList<String>(Arrays.asList(str)));
            }
        }

        return new ArrayList<List<String>>(map.values());
    }

    // this ensures if there is a string with same characters, they will have the
    // same product always
    // as product of prime numbers is always unique
    public double primeProduct(String str) {
        double product = 1;
        for (int i = 0; i < str.length(); i++) {
            // a = 0th index; b=1st index and so on z = 25th index
            product = product * primeNumbers[str.charAt(i) - 'a'];
        }
        return product;
    }

    public static void main(String[] args) {

    }
}