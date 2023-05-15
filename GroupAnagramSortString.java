import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class GroupAnagramSortString {

    public List<List<String>> groupAnagrams(String[] strs) {

        //base case
        if(strs.length == 0 || strs == null) return new ArrayList<>();

        //create hashmap
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i ++){

            String s = strs[i];

            // string -> sequence of characters in an array
            char[] seqChar = s.toCharArray();

            //sort characters in array
            Arrays.sort(seqChar);

            // convert sorted character Array back to string
            String sortedS = String.valueOf(seqChar);

            // if sorted string is not there in hashmap
            if(!map.containsKey(sortedS)){

                // add it as a key and an empty array as a value
                map.put(sortedS, new ArrayList<>());

            }
            // now add original string s as a value to sorted string key
            // map.get(sortedS).add(s);

            List<String> li = map.get(sortedS);
            li.add(s);
            map.put(sortedS, li);

        }
        //return strings grouped as values of hashmap
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args){

        GroupAnagramPrimeProduct object = new GroupAnagramPrimeProduct();
        String[] givenList = new String[]{"eat","tea","tan","ate","nat","bat"};

        List<List<String>> groupedAnagrams = object.groupAnagrams(givenList);

        System.out.println("grouped anagrams are"+ groupedAnagrams);


    }
}

