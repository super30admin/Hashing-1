class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> an = new HashMap<>();
        for(String s : strs){
            char[] schar= s.toCharArray();
            Arrays.sort(schar);
           // String sSort= schar.toString();
            String sSort= String.valueOf(schar);
            if(!an.containsKey(sSort)){
               an.put(sSort, new ArrayList<>());
            }
            an.get(sSort).add(s);
        }
        return new ArrayList<>(an.values());
    }
}