import java.util.*;

public class GroupAnagrams {
    /*
    Given an array of strings, group anagrams together.
    Example: Input: ["eat", "tea", "tan", "ate", "nat", "bat"], Output: [ ["ate","eat","tea"], ["nat","tan"], ["bat"] ]
    Note: All inputs will be in lowercase. The order of your output does not matter.
     */
    /* Leetcode link:  https://leetcode.com/problems/group-anagrams/description/ */

    /*
    Intuition: Take a string - sort it alphabetically and then compare with all other strings till you get anagrams and put them in map.
    return map values as output.
    TC : O(n ^2 log(n))
    SC : O(n)
     */

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, ArrayList<String>> map = new HashMap<>();
        List<List<String>> output = new ArrayList<>();

        for (String s : strs) {

            char[] arr = s.toCharArray();
            Arrays.sort(arr); //O(nlog(n))
            String sortedString = new String(arr);

            if (map.containsKey(sortedString)) {

                ArrayList<String> list = map.get(sortedString);
                list.add(s);
                map.put(sortedString, new ArrayList<String>(list));

            } else {
                List<String> list = new ArrayList<String>();
                list.add(s);
                map.put(sortedString, new ArrayList<String>(list));

            }
        }

        for (String s : map.keySet()) {
            output.add(map.get(s));
        }
        return output;

    }

}
