//Time Complexity O(n*k)
//Space COmplexity O(n*k)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs ==null || strs.length==0)
        return new ArrayList<>();

        Map<String,List<String>> map=new HashMap<>();

        for(String s: strs)
        {
            char[] chars= new char[26];
            for(char c: s.toCharArray())
            {
                chars[c-'a']++;
            }
            String key=String.valueOf(chars);
            if(!map.containsKey(key))
            {
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}