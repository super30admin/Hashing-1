// Approach: Similar to Isomorphic strings, Traverse through the words of the string and map the corresponding character of the pattern using a HashMap.
// Use HashSet to store the second character that can be checked to see if there are duplicate mappings to return false.

// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public boolean wordPattern(String pattern, String s) {

        HashMap<String, Character> sMap = new HashMap<>();
        HashSet<Character> set= new HashSet<>();

        List<String> words = Arrays.asList(s.split("\\s+"));

        if (pattern == null || pattern.length() == 0 || words == null || words.size() == 0 || words.size() != pattern.length()) return false;

        for(int i=0; i<words.size(); i++)
        {
            String patternStr = words.get(i);
            Character sChar = pattern.charAt(i);

            if(sMap.containsKey(patternStr)){
                if(sMap.get(patternStr) != sChar) return false;
            }
            else
            {
                if (set.contains(sChar)) return false;
                sMap.put(patternStr, sChar);
                set.add(sChar);
            }
        }
        return true;
    }
}