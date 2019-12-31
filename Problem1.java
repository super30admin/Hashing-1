// Time Complexity :
//      n - size of string array and k is size of each string 
//      groupAnagrams() - O(n*k)
//      primeP() - O(k)
//      
// Space Complexity :
//      groupAnagrams() - O(n)
//      primeP() - O(1)
//
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Problem1 {
    
   public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Long, List<String>> mp = new HashMap<>();
        
        for(int i=0; i < strs.length; ++i)
        {
            long key = primeP(strs[i]);
            
            if(!mp.containsKey(key))
            {
                mp.put(key, new ArrayList<String>());
            }
            mp.get(key).add(strs[i]);
        }
               
        return new ArrayList<>(mp.values());
    }
    
    private long primeP(String s)
    {
        int[] primes = new int[]{2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
        
        long res = 1;
        
        for(int i=0; i < s.length(); ++i)
        {
            res *= primes[s.charAt(i) - 'a'];
        }
        
        return res;
    }



    public static void main(String[] args)
    {
        String[] arr = new String[]{"eat", "tan", "ate", "aet", "nat", "bat"};

        return groupAnagrams(arr);
    }
}
