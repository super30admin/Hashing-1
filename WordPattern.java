class Solution {

    //Time Complexity -> O(N + M), where N os the length of pattern and M is the length of s
    // Space Complexity -> O(1) + O(M), O(1) for HashMap as max keys inserted will be 26, but O(M), where M is the number of words in s.
    /**
    Steps:
    1. Split and store s in a list of words
    2. Compare sList size with pattern length, they both should match
    3. We need 2 way mapping reference, so we use 1 HashMap to map pattern character to a word from s and a HashSet to check if the word already existed in the set to avoid reverse duplication
     */
    public boolean wordPattern(String pattern, String s) {
        if(pattern == null || pattern.length() == 0 || s == null || s.length() == 0) return false;
        String[] words = s.split(" ");
        List<String> sList = new ArrayList(Arrays.asList(words));
        if(pattern.length() != sList.size()) return false;
        Map<Character, String> map= new HashMap<>();
        Set<String> trackWords = new HashSet<>();

        for(int i = 0; i<pattern.length(); i++){
            char c = pattern.charAt(i);
            if(!map.containsKey(c) && trackWords.contains(sList.get(i))) return false;
            else if(!map.containsKey(c)){
                map.put(c, sList.get(i));
                trackWords.add(sList.get(i));
            }
            else if(!map.get(c).equals(sList.get(i))) return false;
        }
        return true;
    }
}
