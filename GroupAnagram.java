//Time Complexity O(nk) where k is length of word in array string
//Space Complexity O(nk)
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }
        // the constraint given is, we are only using the 26
        // small alaphabets, so we require first 26 prime numbers.
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};

        Map<Long, List<String>> anagramGroup = new HashMap<>();
        List<String> lStr = new ArrayList<>();

        for(String str: strs) {
            Long primeProduct = calculatePrimeProduct(str, primes);

            //checking existence
            if(!anagramGroup.containsKey(primeProduct)) {
                anagramGroup.put(primeProduct, new ArrayList());
            }

            // add string to anagram list
            anagramGroup.get(primeProduct).add(str);
        }

        return new ArrayList(anagramGroup.values());
    }

    private Long calculatePrimeProduct(String str, int[] primes) {
        Long primeProduct = 1L;

        for(int i=0; i<str.length(); i++) {
            primeProduct *= primes[str.charAt(i)-'a'];
        }

        return primeProduct;
    }

    public static void main(String[] args) {
        GroupAnagram groupAnagram=new GroupAnagram();
        System.out.println(groupAnagram.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
}
