//logic
// sort the string based on string character and make that key and original string as value and put it in hash map
// if key exist, then add the string 

import java.util.*;

class GroupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            if (!map.containsKey(String.valueOf(ch))){
                map.put(String.valueOf(ch), new ArrayList<String>());
            } 
            map.get(String.valueOf(ch)).add(str);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args){
        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}