import java.util.*;

// Time Complexity :
//  If we are performing sort on the String ==> O(NKlogK) :: k -> Avg. Length of String
// Using Key Generate Frequency Array -> O (NK)

// Space Complexity : O(NK) -> Total content in the HashMap

// Did this code successfully run on Leetcode : Yes

// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
public class GroupAnagram {

    List<List<String>> ans = new ArrayList<>();
    Map<String, List<String>> map = new HashMap<>();

    /**
     * @param s
     * @return - Generate Unique Key for Anagrams using frequency Array
     */
    private String generateKey(String s) {

        char[] ca = new char[26];

        for (char c : s.toCharArray()) ca[c - 'a']++;

        return String.valueOf(ca);

    }

    // Sorting Strings
    private String sortString(String s) {

        char[] ca = s.toCharArray();
        Arrays.sort(ca);
        return String.valueOf(ca);

    }

    public List<List<String>> groupAnagrams(String[] strs) {

        if (strs.length == 0) return ans;

        // Generate Map
        for (String s : strs) {

            // sort each String and use it as a key
            //   String key = sortString(s);

            // Generate Key
            String key = generateKey(s);

            if (!map.containsKey(key)) map.put(key, new ArrayList<>());

            // Adding Anagrams
            map.get(key).add(s);

        }

        // IMP - Add the values in Result
        for (List<String> lst : map.values()) ans.add(lst);

        return ans;

    }


}
