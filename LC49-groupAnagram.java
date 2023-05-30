/*
 * Time complexity = O(nk)
 * Space Complexity = O(n)
 */
import java.util.*;;
/*
 * Time complexity = O(nk)
 * Space Complexity = O(n)
 */
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // use prime number multiplication as hashing technique for 
        // string to store into hashmap<str, str[]>

        HashMap<Double, List<String>> map = new HashMap<Double, List<String>> ();

        for (int i = 0; i< strs.length; i++) {
            // get key
            Double key = primeValue(strs[i]);

            if (!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(strs[i]);

        }
        return new ArrayList<>(map.values());        
    }

    // Although, multiplication of prime numbers return integer only, butWe 
    // use Double here intentionally, because multiplication will quickly overflow 
    //the integer or long. Hence we use Double. 
    //Max value in Double is much higher than Long, because of Mentissa and Exponent 
    public Double primeValue(String s){
        int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        Double ret = 1.0;
        for (int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            ret *= prime[ch-'a'];
        }

        return ret;
    }
}
/* 

 // Time complexity = O(nklogk)
 // Space Complexity = O(n)
 
import java.util.*;;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // use sorting as hashing technique for string to store into hashmap<str, str[]>

        HashMap<String, List<String>> map = new HashMap<String, List<String>> ();

        for (int i = 0; i< strs.length; i++) {
            // sort
            char[] sorted = strs[i].toCharArray();
            Arrays.sort(sorted);
            String key = new String(sorted);

            if (!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(strs[i]);

        }

        return new ArrayList<>(map.values());

        
    }
}
*/


