 
//Time Complexity :O(NK) where N is the size of given array and K is the average length of String
//Space Complexity :O(NK) 
//Did this code successfully run on Leetcode :Yes
//Any problem you faced while coding this : No 

// Prime Product Pattern 
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class GroupAnagram {
    
    public int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101}; 

    public List<List<String>> groupAnagrams(String[] strs) {
       
        List<List<String>> result = new ArrayList<>();

        Map<BigInteger,List<String>> map  = new HashMap<>();

        for(String s : strs){
            BigInteger uniqueFactor = uniqueKey(s);
            if(map.containsKey(uniqueFactor))
                 map.get(uniqueFactor).add(s);
            else
            {
                List<String> l1 = new ArrayList<>();
                l1.add(s);
                map.put(uniqueFactor,l1); 
            }     
        }

    for(Map.Entry<BigInteger, List<String>> entry : map.entrySet()){
        result.add(entry.getValue());

    }
return result;

    }

    public BigInteger uniqueKey(String str){
        BigInteger uniqueFactor = new BigInteger(String.valueOf(1));
        for(char c : str.toCharArray()){
            //uniqueFactor *= primes[c-'a'];
            BigInteger temp = new BigInteger(String.valueOf(primes[c-'a']));
           uniqueFactor= uniqueFactor.multiply(temp);
        }
        return uniqueFactor;
    }
}
