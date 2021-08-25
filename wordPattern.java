// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class wordPattern {
    public boolean wordPattern(String pattern, String s) {
        // convert pattern and string to arrays
        char[] patternArray = pattern.toCharArray();
        String[] splitString = s.split(" ");

        // return false if the lengths of arrrays are not equal
        if(patternArray.length != splitString.length) return false;

        // Initialize hashmaps to store co-relations
        HashMap<Character, String> pMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();

        for(int i = 0; i < patternArray.length; i++){
            // get character at each index of pattern
            char pChar = patternArray[i];
            // get string at each index of string array
            String sString = splitString[i];

            if(pMap.containsKey(pChar)){
                // if pattern already exists in hashmap and is not mapped to the same word then return false
                if(!pMap.get(pChar).equals(sString)) return false;
            } else {
                // if pattern does not exist in hashmap then add pattern and corresponding word to hashmap
                pMap.put(pChar, sString);
            }

            if(sMap.containsKey(sString)){
                // if word already exists in hashmap and is not mapped to the same pattern then return false
                if(sMap.get(sString) != pChar) return false;
            } else {
                // if word does not exist in hashmap add the word and corresponding pattern to hashmap
                sMap.put(sString, pChar);
            }
        }
        return true;
    }
}