class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s:strs){
            char [] c = s.toCharArray();
            Arrays.sort(c);
            String k = String.valueOf(c);
            if(map.containsKey(k)){
                List<String> list1 = map.get(k);
                list1.add(s);
                map.put(k,list1);
            }
            else{
            List<String> list = new ArrayList<>();
            list.add(s);
            map.put(k,list);
            }
        }
        List<List<String>> ans = new ArrayList<>(map.values());
        return ans;
    }

}


