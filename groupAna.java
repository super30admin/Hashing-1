class groupAna {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str:strs){
            char[] chArr = str.toCharArray();
            Arrays.sort(chArr);
            String sorted = String.valueOf(chArr);
            if(!map.containsKey(sorted)) {
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(str);
        }
        return new ArrayList<>(map.values());
    }
}