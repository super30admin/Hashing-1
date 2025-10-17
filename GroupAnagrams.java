import java.math.BigDecimal;
import java.util.List;
import java.util.*;
/*
Time complexity: O(n)
Space complexity: O(n)

Approach:
1) Get a hashcode for each string that will be some for two strings if and only if they are anagrams
2) For that hash code calculation assign a prime number for each char and multiply those primes to get hascode
       for a particular string
3) Have a HasMap and store the strings with the same hash code in an array
 */

public class GroupAnagrams {
        public List<List<String>> groupAnagrams(String[] strs) {
            // Have hashmap to group the anagrams and store in as a List in values
            HashMap<BigDecimal,ArrayList<String>> hashMap = new HashMap<>();

            // Calculate the hasCode that will be same if and only if those stings are anagrams
            for (String str:strs){
                // BigDecimal is used as the value can be very big if the string is big
                BigDecimal hashCode = getHashCode(str);
                // If there isn't any matching anagram till now
                if (!hashMap.containsKey(hashCode)){
                    // Create an Entry set in hashmap
                    hashMap.put(hashCode, new ArrayList<String>());
                }
                // Add the string at respective hasCode List
                hashMap.get(hashCode).add(str);
            }
            return new ArrayList<>(hashMap.values());
        }

        public BigDecimal getHashCode(String str){
            BigDecimal hashCode = new BigDecimal(1);
            // Create an Array of length 26 with unique primary number at each index
            int[] primeArray = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
                    41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
            // Calculate the product of prime numbers corresponding to the character in the string
            for(char ch: str.toCharArray()) {
                hashCode = hashCode.multiply(BigDecimal.valueOf(primeArray[ch-'a']));
            }
            return hashCode;
        }
    }

