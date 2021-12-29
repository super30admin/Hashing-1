class Problem1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length ==0){
            return new ArrayList();
        }
        
        Map<String , List> hmap = new HashMap<>();
        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            
            String key = String.valueOf(ch);
            if(!hmap.containsKey(key)){
                hmap.put(key,new ArrayList());
                
            }
            hmap.get(key).add(s);
        }
        return new ArrayList(hmap.values());
    }
}