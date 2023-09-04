import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//TC - O(n)
//SC -O(n)
//Question  Given an array of strings, group anagrams together.
class Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for(int i=0; i<strs.length; i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String anagram = new String(chars);
            if(!map.containsKey(anagram)){
                map.put(anagram, new ArrayList<>());
            }
                List<String> anagramList = map.get(anagram);
                anagramList.add(strs[i]);
               map.put(anagram, anagramList);

        }
        return new ArrayList<>(map.values());
        
    }

    public static void main(String[] args) {
        Anagrams a = new Anagrams();

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = a.groupAnagrams(strs);
        for (List<String> group : result) {
            for (String value : group) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.println();

        String[] strs1 = {""};
        List<List<String>> result1 = a.groupAnagrams(strs1);
        for (List<String> group : result1) {
            for (String value : group) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.println();

        String[] strs2 = {"a"};
        List<List<String>> result2 = a.groupAnagrams(strs2);
        for (List<String> group : result2) {
            for (String value : group) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

}
