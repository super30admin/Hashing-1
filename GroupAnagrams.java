class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<List<String>> outer = new ArrayList<>();

        HashMap<String, List<String>> map = new HashMap<>();
        ArrayList<String> inner = new ArrayList<>();
        for(int i=0;i<strs.length;i++){

            char tempArray[] = strs[i].toCharArray();
            Arrays.sort(tempArray);

            if(!map.containsKey(String.valueOf(tempArray))){
                inner = new ArrayList<>();
                inner.add(strs[i]);
                map.put(String.valueOf(tempArray),inner);
            }else{
                map.get(String.valueOf(tempArray)).add(strs[i]);
            }
        }

        for(String key:map.keySet()){
            outer.add(map.get(key));
        }
        return outer;
    }
}