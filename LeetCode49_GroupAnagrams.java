//prime Product is alwyas unique. 
//assign each character a prime number and that word will have a unique product. 
//put it into Hashmap -- product as key and --arraylist of words as values. 
//Time - O(n) -- traversing through string array
//space: O(n) -- Hashmap

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();
        
        HashMap<Double, List<String>> map = new HashMap<>();
        
        for(int i  = 0; i< strs.length; i++)
        {
            //calculate the key
            double primeProduct = findPrimeProduct(strs[i]);
            
            if(!map.containsKey(primeProduct))
            {
                map.put(primeProduct, new ArrayList<>());
               
            }
            map.get(primeProduct).add(strs[i]);
        }
        return new ArrayList<>(map.values());
       
    }
    
    private double findPrimeProduct(String s)
    {
        int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        double primeProduct =1;
        for(int i=0; i<s.length();i++)
        {
            int idx = s.charAt(i) - 'a';
            primeProduct = primeProduct * prime[idx];
        }
        return primeProduct;
    }
}