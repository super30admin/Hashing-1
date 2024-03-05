// Time Complexity : O(n*k) k - Avg length of String
// Space Complexity : O(n*k)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only
/*
Brute Force approach is to loop through each element and sort the string. Maintain a hashmap of with key as the sorted string
and add all the same strings in the value. This will take O(nklogk) TC
Optimized approach - Using prime factor hashing; Compute the hashvalue of string using prime factors mapping and multiply it. This way we dont get collisions
Use hashmap to store the hashvalue as key and list of strings in the value part.
 */
public class groupAnagrams {

    int[] primes = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<Double, List<String>> map = new HashMap<>();
        for (String str : strs) {
            Double hashVal = getHashScore(str);
            if (map.containsKey(hashVal)) {
                map.get(hashVal).add(str);
            } else {
                List<String> li = new ArrayList<>();
                li.add(str);
                map.put(hashVal, li);
            }
        }
        for (Double a : map.keySet()) {
            List<String> li = map.get(a);
            result.add(li);
        }
        return result;
    }

    private Double getHashScore(String s) {
        Double res = 1D;
        for (Character ch : s.toCharArray()) {
            res = res * primes[ch - 'a'];
        }
        return res;
    }

}
