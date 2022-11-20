import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//https://leetcode.com/problems/group-anagrams/
//Time Complexity  - O(nk)
//Space Complexity - O(n)
/*Pass through each element of the array of strings, store the key in a hashmap and if the next element has the same key
* as previous then add it to the list. The major crux of the problem is selecting the key. Prime multiplication was utilized as
* each prime multiplier has unique product.
* */
// Worked on leetcode

public class GroupAnagrams {
    public static void main(String[] args) {
       String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
    //HashMap Sorting method
    //Time Complexity - O(nklogk)
    //Space complexity - O(n)
    /*public static List<List<String>> groupAnagrams(String[] strs){

        if(strs==null|| strs.length==0) return new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<String,List<String>>();
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            char[] charArray  = str.toCharArray();
            Arrays.sort(charArray);
            String sorted = String.valueOf(charArray);
            if(!map.containsKey(sorted)) map.put(sorted,new ArrayList<>());
            map.get(sorted).add(str);


        }
        return new ArrayList<>(map.values());
    }*/
    //Using Prime Multiplication Method
    //Time Complexity  - O(nk)
    //Space Complexity - O(n)

    public static List<List<String>> groupAnagrams(String[] strs){
        if(strs==null||strs.length==0) return new ArrayList<>();
        HashMap<Double,List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            double primeProd = primeProduct(str);
            if(!map.containsKey(primeProd)) map.put(primeProd,new ArrayList<>());
            map.get(primeProd).add(str);

        }
    return new ArrayList<>(map.values());

    }

    private static double primeProduct(String str) {
        double result = 1;
        int[] primes={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,87,97,101,103};
        for (int i = 0; i < str.length(); i++) {
            char c  = str.charAt(i);
            int doublePrime = primes[c-'a'];
            result= doublePrime*result;
        }
        return result;
    }


}
