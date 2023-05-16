import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class GroupAnagramPrimeProduct {

    public List<List<String>> groupAnagrams(String[] strs) {
        //base case
        if(strs.length == 0 || strs == null) return new ArrayList<>();

        //create hashmap
        HashMap<Double, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i ++){ //O(n)
            String s = strs[i];

            // call function that calculates prime product of a string
            double primeProduct = primeProduct(s); //O(k)

            // if prime product is not there in hashmap as a key already
            if(!map.containsKey(primeProduct)){

                // add prime product key with an empty array list as value
                map.put(primeProduct, new ArrayList<>());
            }
            // add original string as value to prime product key
            // map.get(primeProduct).add(s);

            List<String> li = map.get(primeProduct);
            li.add(s);
            map.put(primeProduct, li);
        }
        //return strings grouped as values of hashmap
        return new ArrayList<>(map.values());
    }

    private double primeProduct(String s){

        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};

        double product = 1d;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            int primeC = primes[c - 'a'];
            product = product * primeC;
        }
        return product;
    }

    public static void main(String[] args){

        GroupAnagramPrimeProduct object = new GroupAnagramPrimeProduct();
        String[] givenList = new String[]{"eat","tea","tan","ate","nat","bat"};
        
        List<List<String>> groupedAnagrams = object.groupAnagrams(givenList);

        System.out.println("grouped anagrams:"+ groupedAnagrams);


    }
}
