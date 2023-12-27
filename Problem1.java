/*
 *Did this code successfully run on Leetcode : YES
* 
* Any problem you faced while coding this : NO
* 
* Time Complexity: O(n*k) - k length of word
* 
* Space Complexity: O(n) 
* 
*/

class Solution {
    private int[] prime;
   public List<List<String>> groupAnagrams(String[] strs) {
       
      this.prime = new int[] { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101 };  //construct a prime array
       //null
       if(strs == null || strs.length ==0 ) 
       {
           return new ArrayList<>();
       }
       HashMap<Double, List<String>> map = new HashMap<>();  //create a Hashmap
       for(String st : strs)  //k
       {
           double primeProduct = primeProduct(st);
           if(!map.containsKey(primeProduct))
           {
               map.put(primeProduct, new ArrayList<>());
           }
           map.get(primeProduct).add(st);
       }
       return new ArrayList<>(map.values());
   }
   private double primeProduct(String s)
   {
       double result = 1;
       for(int i = 0; i < s.length() ; i++)
       {
           char c = s.charAt(i);
           result = result * prime[c-'a'];
       }
       return result;
   }
}