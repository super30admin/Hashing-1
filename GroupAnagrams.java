// Time Complexity : O(nk) (iterating through the string of average length k O(k) + O(n) n is the number of words in the list)
// Space Complexity : O(n) - Imagine all the elements are unique and you add them in hashmap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Implementation by using prime numbers asscoiated with lower case letters and adding the product as the key to the hashmap. This approach adds duplicate strings and works for empty string


class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
      //version 2 which includes sorting
      //base case
       if(strs==null || strs.length == 0) return new ArrayList<>();
       //to prevent Integer overflow use double data type which has much larger range
       HashMap<Double,List<String>> map = new HashMap<>();
       for(int i=0;i<strs.length;i++){
           String str = strs[i];
          double primeProduct = calculatePrimeProduct(str);
           if(!map.containsKey(primeProduct)){
               map.put(primeProduct,new ArrayList<>());
           }
           map.get(primeProduct).add(str);

       }
   
       return new ArrayList<>(map.values());

  }
      private double calculatePrimeProduct(String s){
  int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
           double product = 1;
           for(int i=0;i < s.length();i++){
               char value = s.charAt(i);
              product = product * prime[value - 'a'];
           }
           return product;

       }
}