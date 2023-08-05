class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0) return new ArrayList();
        Map<String, List> result = new HashMap<>();
        for(String s: strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            if(!result.containsKey(key)){

                result.put(key,new ArrayList());
            }
            result.get(key).add(s);

        }
        return new ArrayList(result.values());
    }
}
