import java.math.BigInteger;

class GroupingAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> dict = new HashMap<>();
        List<String> origStr;

        for(String s : strs) {
            int[] freq = new int[26];

            for(char c : s.toCharArray()) {
                freq[c - 'a']++;
            }
            String freqStr = Arrays.toString(freq);
            if(dict.containsKey(freqStr)) {
                origStr = dict.get(freqStr);
            } else {
                origStr = new ArrayList<>();
            }
            origStr.add(s);
            dict.put(freqStr, origStr);
        }

        return new ArrayList<>(dict.values());
    }
}