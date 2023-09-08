class Solution {
    public List<List<String>> groupAnagrams(String[] strs) { 
// Time complexity: O(nk) where n is number of elements in the string array and k is the length of each element of the array.
// Space Complexity: O(n)
        HashMap<Double, ArrayList> map = new HashMap<>();  

        for(int i=0;i<strs.length;i++)
        {
           String str = strs[i];
           double primeProduct = primeProduct(str);

           if(!map.containsKey(primeProduct))
           {
               map.put(primeProduct,new ArrayList<String>());
           }
           map.get(primeProduct).add(str);
        }

        return new ArrayList(map.values());
        
    }

    private double primeProduct(String str)
    {
      int[] primes = new int[]{2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
      HashMap<Character, Integer> map = new HashMap<>();
      double mul = 1;
      for(int i = 0;i<str.length();i++)
      {   
          mul*=primes[str.charAt(i)-'a'];
      }
     return mul;

    }
}
