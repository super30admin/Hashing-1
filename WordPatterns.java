// Time Complexity: O(n)
// Space Complexity: O(1) + O(n) => O(n) for the string array

// 1: We use a HashMap to maintain the pattern-value combinations
// 2: If a character from the pattern is encountered for the first time, we add into the HashMap and make sure that the corresponding string value does not already exist
// 3: If the character from the pattern already exists, we check that the value is as expected else return false
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map1 = new HashMap<>();
        String[] storedString = s.split(" ");

        if (pattern.length() != storedString.length)
            return false;

        for (int i = 0; i < pattern.length(); i++) {
            char patternChar = pattern.charAt(i);
            String currentString = storedString[i];

            if (!map1.containsKey(patternChar)) {
                if (map1.containsValue(currentString))
                    return false;
                map1.put(patternChar, currentString);
            } else {
                if (!map1.get(patternChar).equals(currentString))
                    return false;
            }
        }

        return true;

    }
}