// Group Anagrams
// Time Complexity : O(nk)
// n for iterating the whole string array & k for searching
// Space Complexity : O(nk)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach
// iterate over and calculate prime product of the string.
// for the prime product, assign all 26 char to a different prime number.
// anagrams will have same product and they will create colission in the hashmap.

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //base case
        if(strs == null || strs.length== 0)
            return new ArrayList<>();

        HashMap<Double, List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++) {
            //for each string call the findPrimeProduct()
            String s = strs[i];
            double primeProduct = findPrimeProduct(s);
            if(!map.containsKey(primeProduct)) {
                //if product not present, it's a new key, put
                map.put(primeProduct, new ArrayList<>());
            }
            map.get(primeProduct).add(s); //add the string
        }
        return new ArrayList<>(map.values());
    }

    //helper function
    private double findPrimeProduct (String s) {
        int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        double primeProduct = 1;
        for(int i=0; i<s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            primeProduct = primeProduct * prime[idx];
        }
        return primeProduct;
    }

}

