import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
//To Group Anagrams for we use hashmap and map anagrams with the help of a key, a key is generated buy using a array of len 26 and count++ ing for each occurance of a char. we then append it and create a string which is used as a key, if no key exists in the map then a new array list is created and str is added if key exists str is added to existing key, lastly we return the lists.
// TC is O(n*k) where n is no.of strs in array and k is the max len of a string
// SC is O(n*k) where n is no.pf strs and k is max len of key
public class problem1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List> anagrams = new HashMap<>();
        int[] count = new int[26];
        for(String s : strs){
            Arrays.fill(count, 0);
            for(char c : s.toCharArray())
                count[c-'a']++;
            String key = Arrays.toString(count);
            if(!anagrams.containsKey(key))
                anagrams.put(key, new ArrayList<>());
            anagrams.get(key).add(s);
        }
        return new ArrayList(anagrams.values());
    }
}
