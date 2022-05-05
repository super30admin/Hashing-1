/**
Time Complexity : O(N)
Space Complexity : O(N) 
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
**/
class Solution 
{

    private int primes[] = new int[]{
                                        2, 3, 5, 7, 11, 13,
                                        17, 19, 23, 29, 31, 37, 41, 
                                        43, 47, 53, 59, 61, 67, 71, 
                                        73, 79, 83, 89, 97, 101,103};

    
    public List<List<String>> groupAnagrams1(String[] strs) 
    {
        List<List<String>> output = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        
        
        if(strs == null || strs.length ==0)
            return output;
        
        for(String str: strs)
        {
            
            char input[] = str.toCharArray();
            Arrays.sort(input);
            
            String strnew = new String(input);
            
            if(map.get(strnew) == null)
                map.put(strnew, new ArrayList<>());
            
            map.get(strnew).add(str);

        }
        
        for(String str: map.keySet())
        {
            output.add(map.get(str));
        }

        return output;
    }

    public List<List<String>> groupAnagrams2(String[] strs) 
    {
        List<List<String>> output = new ArrayList<>();
        Map<Integer, List<String>> map = new HashMap<>();
        
        
        if(strs == null || strs.length ==0)
            return output;

        for(String str: strs)
        {
            int sum =0;
            for(int i =0; i<str.length() ; i++)
            {
                sum = sum + hashValue(str.charAt(i));
            }
            
            if(map.get(sum) == null)
                map.put(sum, new ArrayList<>());
            
            map.get(sum).add(str);

        }
        
        for(int sum: map.keySet())
        {
            output.add(map.get(sum));
        }

        return output;
    }

    int hashValue(char input)
    {
        int index = input - 'a';
        int primeXOR = primes[index] ^ index;
        return primes[index]*primes[index];
    }

    
}