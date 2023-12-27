import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> h = new HashMap<>();
        for(String s : strs)
        {
            String hashValue = getHash(s);
            if(!h.containsKey(hashValue))
                h.put(hashValue, new ArrayList<String>());

            h.get(hashValue).add(s);
        }

        return new ArrayList<>(h.values());
    }

    private String getHash(String s)
    {
        char[] hash = new char[26];
        for(char c : s.toCharArray())
        {
            hash[c-'a']++;
        }
        return String.valueOf(hash);
    }
}
