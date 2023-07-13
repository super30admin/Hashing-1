import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Group Anagrams
class Solution {
    int[] primes=new int[]{2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103};
    double primeProduct;
    List<String> list1;

    public List<List<String>> groupAnagrams(String[] strs)
    {
        //take prime product of the numbers to find anagrams
        Map<Double,List<String>> hmap=new HashMap<>();
        for(String str:strs)
        {
            primeProduct=getPrimeProduct(str);
            if(hmap.containsKey(primeProduct))
            {
                hmap.get(primeProduct).add(str);
            }
            else
            {
                list1=new ArrayList<>();
                list1.add(str);
                hmap.put(primeProduct,list1);
            }
        }
        return new ArrayList<> (hmap.values());

    }
    private double getPrimeProduct(String str)
    {
        double result=1d;
        for(int i=0;i<str.length();i++)
        {
            result=result*primes[str.charAt(i)-'a'];
        }
        return result;
    }
}