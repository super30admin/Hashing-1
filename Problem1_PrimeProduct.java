// N = Total number of words
// K = Average length of each word
// Time Complexity : O(NK)
// Space Complexity : O(Nk)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public static double getPrimeProductKey(String s) {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101,103};
        double primeProduct = 1;
        for(char val:s.toCharArray()){
            primeProduct = primeProduct * primes[val-'a'];
        }
        return primeProduct;
    }
    //
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double, List<String>> map = new HashMap<>();
        for (String iter : strs) {
            Double key = getPrimeProductKey(iter);
            if (!map.containsKey(key)) {
                LinkedList<String> list = new LinkedList<>();
                list.add(iter);
                map.put(key, list);
            } else {
                map.get(key).add(iter);
            }
        }
        //
        
        return new ArrayList(map.values());
    }
}
