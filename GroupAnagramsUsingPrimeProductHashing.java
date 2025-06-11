// Time Complexity : O(n * k), where n is the number of strings and k is the maximum length of a string.
// Space Complexity : O(n * k), for storing the grouped anagrams in the hashmap.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach:
// Prime product hashing used to uniquely represent anagrams.
// We assign each character a unique prime number and compute the product of primes for each string.
// Due to the unique factorization property of primes, all anagrams produce the same product.
// This product is used as a key in a hashmap to group anagrams together.
// Finally, we return the grouped lists of anagrams from the hashmap.


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double,List<String>> map = new HashMap<>();
        //loop through the strings
        for (int i = 0; i < strs.length; i++) {//O(n)

            //Get the key for hash map
            double key = getHash(strs[i]);//O(k)

            //If the key is not present add it
            if(!map.containsKey(key)){//O(1)
                map.put(key, new ArrayList<>());
            }
            //Then add value to the key
            map.get(key).add(strs[i]);//O(1)
        }
        //Return the values of hash map
        return new ArrayList<>(map.values());
    }

    private double getHash(String str) {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        double hash = 1;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            hash = hash * primes[c - 'a'];
        }
        return hash;
    }
}