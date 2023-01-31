import java.util.*;
class Solution_anagrams {
    public static double form_factor(String word){
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101,103};
        double form_f = 1;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            int prime = primes[c - 'a'];
            form_f *= prime;
        }
        return form_f;
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double,List<String>> map = new HashMap<>();
        for(String each:strs){
            double form_factor = form_factor(each);
            if(!map.containsKey(form_factor))
                map.put(form_factor,new ArrayList<>());
            map.get(form_factor).add(each);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        System.out.println(Solution_anagrams.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
}