// Time Complexity : O(nk)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

// We can do this problem in one pass using a hashmap for constant lookup
// To calculate key we use primeproduct which will give a unique number for anagrams


class Solution {

    private double primeProduct(String s){ //fn to calculate prime product
        char[] charStr = s.toCharArray();
        int[] primeMap = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 
            23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101,103};
        double pp = 1;
        for(char ch:charStr)
        {
            pp*=primeMap[ch-'a'];
        }
        return pp;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double, List<String>> hmap = new HashMap<>();
        for(String str: strs)
        {
            double primeProduct = primeProduct(str);
            if(!hmap.containsKey(primeProduct)){
                hmap.put(primeProduct,new ArrayList<>());
            }
            hmap.get(primeProduct).add(str);
        }
        return new ArrayList<>(hmap.values());
    }
}