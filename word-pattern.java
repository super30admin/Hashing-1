class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        //base case
        if (words.length != pattern.length()) {
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(word)) // checks if the ch is equal to the word if the ch is already added
                    return false;
            } else {
                if (map.containsValue(word)) // checks if the value is already added to bi direction checking
                    return false;
                map.put(ch, word);
            }
        }
        return true;
    }
}

//TC:O(n)
//SC:O(n)