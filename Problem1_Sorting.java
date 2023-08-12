class Solution {
    public String sortString(String input) {
        char[] temp = input.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }
    //
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String iter : strs) {
            String key = sortString(iter);
            if (!map.containsKey(key)) {
                LinkedList<String> list = new LinkedList<>();
                list.add(iter);
                map.put(key, list);
            } else {
                map.get(key).add(iter);
            }
        }
        //
        List<List<String>> returnList = new LinkedList<>();
        for(Map.Entry entry : map.entrySet()){
            returnList.add((List<String>) entry.getValue());
        }
        return returnList;
    }
}
