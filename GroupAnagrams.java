class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> resultMap = new HashMap<String,List<String>>();
        List<List<String>> result = new ArrayList<List<String>>();
        for(String s : strs){
            char[] stringChars = s.toCharArray();
            Arrays.sort(stringChars);
            String sortedChars = new String(stringChars);
            if(!(resultMap.containsKey(sortedChars))){
                resultMap.put(sortedChars, new ArrayList<>());
            }
            resultMap.get(sortedChars).add(s);
        }
        return new ArrayList<>(resultMap.values());
    }
}