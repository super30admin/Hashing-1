import java.util.HashMap;

// Time Complexity : O(n)
// Space Complexity : O(1)

public class WordPatterns {
    public static boolean wordPattern(String pattern, String s) {

        String[] str = s.split(" ");

        if (pattern == null && str == null)
            return true;
        if (pattern == null || str == null)
            return false;
        if (pattern.length() != str.length)
            return false;

        HashMap<Character, String> patternMap = new HashMap<>();
        HashMap<String, Character> stringMap = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char patternChar = pattern.charAt(i);
            String stringArr = str[i];
            if (!patternMap.containsKey(patternChar)) {
                patternMap.put(patternChar, stringArr);
            } else {
                String str1 = patternMap.get(patternChar);
                if (str1.equals(stringArr) == false)
                    return false;
            }

            if (!stringMap.containsKey(stringArr)) {
                stringMap.put(stringArr, patternChar);
            } else {
                char ch = stringMap.get(stringArr);
                if (ch != patternChar)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        boolean result = wordPattern(pattern, s);
        System.out.println(result);
    }

}
