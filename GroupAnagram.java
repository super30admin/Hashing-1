// Time Complexity : O(nk)
// Space Complexity : O(nk)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class GroupAnagram {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            List<List<String>> result = new ArrayList<>();

            if(strs == null) return result;

            Map<Double, ArrayList<String>> map = new HashMap<>();

            for(String str : strs){
                double primeProduct = getPrimeProduct(str);
                if(!map.containsKey(primeProduct)){
                    map.put(primeProduct, new ArrayList<>());
                }
                map.get(primeProduct).add(str);
            }
            return new ArrayList<>(map.values());
        }

        private double getPrimeProduct(String str){
            int prime[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
                    101,103};
            double product = 1;
            for(int i = 0; i < str.length(); i++){
                product = product *(prime[str.charAt(i)-'a']);
            }
            return product;
        }
    }
}
