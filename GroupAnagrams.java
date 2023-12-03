// Time Complexity : O(n * k) where k is the length of max word
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double,List<String>> map=new HashMap<>();
        
        for(int i=0;i<strs.length;i++){
            String s1=strs[i];
            double product = calculatePrimeProduct(s1);
            if(map.containsKey(product)){
                map.get(product).add(s1); 
            }else{
                map.put(product,new ArrayList<>());
                map.get(product).add(s1);
            }
        }
        return new ArrayList<>(map.values());
    }
    public double calculatePrimeProduct(String s) {
        int[] primeNos = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61,67, 71, 73, 79, 83, 89,97, 101 };
        double product = 1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            product = product * primeNos[c - 'a'];
        }
        return product;
    }
}