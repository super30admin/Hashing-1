/*
Approach-1
convert s to character Array
check if sand char array ength are same, then only proceed
take a HashMap, and HashSet
if map contains character - check if the string is same as what's stored. else return false
also do the entry in Set, for verification
TC: O(m+n)
sc: O(1) + O(1) - for 26 string at max*/

class Solution {
    public boolean wordPattern(String pattern, String s) {
        // base case
        if (s == null || pattern == null)
            return false;

        // s = dog cat cat dog
        // p = aaaa

        String[] sArr = s.split(" ");
        if (pattern.length() != sArr.length) {
            return false;
        }

        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < sArr.length; i++) {
            char c = pattern.charAt(i);
            String str = sArr[i];

            if (map.containsKey(c)) {
                if (!str.equals(map.get(c)))
                    return false;

            } else if (set.contains(str)) {
                return false;
            }
            map.put(c, str);
            set.add(str);
        }
        return true;
    }
}

/*
 * Approach-2
 * convert s to character Array
 * check if sand char array ength are same, then only proceed
 * two Hashmap one for string to char, and another for char to string mapping
 * TC: O(m+n)
 * sc: O(1) 26 char at max + O(n) - for string array
 */

class Solution {
    public boolean wordPattern(String pattern, String s) {
        // base case
        if (s == null || pattern == null)
            return false;

        // s = dog cat cat dog
        // p = aaaa

        String[] sArr = s.split(" ");
        if (pattern.length() != sArr.length) {
            return false;
        }

        Map<Character, String> char_map = new HashMap<>();
        Map<String, Character> str_map = new HashMap<>();

        for (int i = 0; i < sArr.length; i++) {
            char c = pattern.charAt(i);
            String str = sArr[i];

            if (char_map.containsKey(c)) // a dog; dog a
            {
                if (!str_map.containsKey(str) || str_map.get(str) != c)
                    return false;
            } else if (str_map.containsKey(str) && !char_map.containsKey(c)) {
                return false;
            }
            char_map.put(c, str);
            str_map.put(str, c);
        }
        return true;
    }
}