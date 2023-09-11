// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes https://leetcode.com/problems/group-anagrams/submissions/1044892657/
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only
/*
 * Use hashMap to maintain the primeProduct and strings of array List with same PrimeProduct
 * Generate the primeProduct of each string in the array
 * Add the values of list to a array list and return 
 */
import java.util.*;
class Solution2 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Double, List<String>> hp = new HashMap<>();
        for(int i=0; i<strs.length;i++){
            double primeProduct = primeProduct(strs[i]);
            if(!hp.containsKey(primeProduct))
                hp.put(primeProduct, new ArrayList<>());
            hp.get(primeProduct).add(strs[i]);
        }
        return new ArrayList<>(hp.values());
                                                                          
    }
    double primeProduct(String s){
        double prod=1;
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        for(int i=0;i<s.length();i++){
            char c1 = s.charAt(i);
            prod = prod * primes[c1-'a'];
        }
        return prod;
    }
}
// Time Complexity : O(nlogn)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes https://leetcode.com/problems/group-anagrams/submissions/1044892657/
// Any problem you faced while coding this : No

class Solution1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hp = new HashMap<>();

        for(int i=0; i< strs.length ; i++){
            char[] str = strs[i].toCharArray();
            Arrays.sort(str);
            String sorted = String.valueOf(str);
            if(!hp.containsKey(sorted)){
                hp.put(sorted, new ArrayList<>());
            }
            hp.get(sorted).add(strs[i]);
        }
        return new ArrayList<>(hp.values());
    }
}