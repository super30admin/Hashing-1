class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // can also be solved using prime product technique
        //TC - O(nk)
        //SC - O(n)
        if(strs.length == 0)
            return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs) {
            int[] freq = new int[26];
            for(char ch : str.toCharArray()) {
                freq[ch - 'a']++;
            }
            String word = Arrays.toString(freq);


            if(!map.containsKey(word))
                map.put(word, new ArrayList<>());
            map.get(word).add(str);

        }
        return new ArrayList<>(map.values());
    }

}