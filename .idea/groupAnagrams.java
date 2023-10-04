// Time Complexity : O(n*k) where k is the avaerage or maximum length of the words
// Space Complexity : O(n) for the HashMap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach in three sentences only
//product of prime numbers is unique,
// so assign each alphabet a unique prime number

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double,List<String>> store = new HashMap<>();

        int[] primeNos = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103};

        double product;
        for(int i = 0;i<strs.length;i++){
            char[] tempArray = strs[i].toCharArray();

            product = 1;
            for(int j = 0;j<tempArray.length;j++){
                char c = tempArray[j];
                product = product * primeNos[c - 'a'];
            }

            if(!store.containsKey(product)){
                store.put(product, new ArrayList<>());
            }

            store.get(product).add(strs[i]);
        }

        return new ArrayList<>(store.values());

    }
}