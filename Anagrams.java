class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();
        HashMap<String, List<String>> hmap = new HashMap<>();
        
        for (int i = 0; i< strs.length; i++){
            List<String> list = new ArrayList<String>();
            char[] str_i = strs[i].toCharArray();
            Arrays.sort(str_i);
            String sorted_i = String.valueOf(str_i);
            if(!hmap.containsKey((sorted_i))){
                hmap.put(sorted_i, list);
            }
            hmap.get(sorted_i).add(strs[i]);       
        }
        return new ArrayList<>(hmap.values());
    }
}