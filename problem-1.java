// Time Complexity : O(nm) where m is the length of the string
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double, List<String>> map = new HashMap<>();
        for(String s : strs){
            double primeProd=primeProduct(s);
            if(map.get(primeProd)==null){
                map.put(primeProd, new ArrayList<>());
            }
                map.get(primeProd).add(s);
        }
        return new ArrayList<>(map.values());
    }
    public double primeProduct(String s){
        double res=1;
        for(int i=0; i<s.length(); i++){
            res*=prime[s.charAt(i)-'a'];
        }
        return res;
    }
}
