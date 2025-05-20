package Problem1;

import java.util.*;
public class Anagrams {
    static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result =  new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for(String wrd : strs) {
            char[] chars = wrd.toCharArray();
            Arrays.sort(chars);

            String str = new String(chars);
            if(!map.containsKey(str)) map.put(str, new ArrayList<>());

            map.get(str).add(wrd);
        }

        for(List<String> list : map.values()) {
            result.add(list);
        }

        return result;
    }
    public static void main(String[] args) {

        String[] anag = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> list = groupAnagrams(anag);
        System.out.println("Problem1.Anagrams are:");
        for (List<String> innerList : list) {
            for (String element : innerList) {
                System.out.print(element + " ");
            }
            System.out.println();
        }


    }
}
