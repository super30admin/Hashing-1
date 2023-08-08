// Time Complexity : O(nk)
// Space Complexity : O(nk)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<Double, List<String>> map = new HashMap<>();

        for(String str : strs) {
            double prod = primeProduct(str);
            if(!map.containsKey(prod)) {
                map.put(prod, new ArrayList<>());
            } 
            map.get(prod).add(str);
        }

        return new ArrayList(map.values());
    
        
    }

    public static double primeProduct(String str)
    {
        int [] index =  {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101,103};
        double product = 1d;
        for(int i=0; i<str.length();i++)
        {
            char c=str.charAt(i);
           product*=index[c-'a'];
        }
        return product;
    }
}