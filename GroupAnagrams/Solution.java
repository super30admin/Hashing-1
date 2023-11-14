//Time Complexity : O(nk)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * We calculated the hash of each word, if the hash is same as any other word, then those 2 are anagrams.
 * We have only 26 alphabets, so we create an array of first 26 prime numbers. Based on the character of each word, find the
 * index and multiply the prime numbers.
 */
class Solution {

    int[] primeArr;
    public List<List<String>> groupAnagrams(String[] strs) {

        primeArr = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};

        Map<Double, List<String>> map = new HashMap<>();

        for(String s : strs) { //O(n)

            double key = getHash(s); //O(k)

            if(!map.containsKey(key))
                map.put(key, new ArrayList<>());

            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }

    private double getHash(String s) {

        double hash = 1d;

        for(char ch : s.toCharArray())
            hash *= primeArr[ch - 'a'];

        return hash;
    }
}