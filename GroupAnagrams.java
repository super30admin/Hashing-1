import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//Time complexity = n+k with out sorting
//Time complexity = n+klogk with sorting
//space complexity = o(1)
class GroupAnagrams {
    Double primeNumber(String s)
    {
        int [] prime = new int [] {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103};
        double result = 1.0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            result = result * (prime[ch - 'a']);
        }
        return result;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        // HashMap<String,List<String>> anagramMap =  new HashMap<>();
        HashMap<Double,List<String>> anagramMap =  new HashMap<>();
        for(String s : strs) //n
        {
            //Sort
            // char[] charArr = s.toCharArray();
            // Arrays.sort(charArr);//klogk
            // String sorted = new String(charArr);
            double num = primeNumber(s);
            if(!anagramMap.containsKey(num)) //+k
            {
                anagramMap.put(num,new ArrayList<>());
            }
            anagramMap.get(num).add(s);
        }
        return new ArrayList<>(anagramMap.values());
    }
}