class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0){
            return new ArrayList();
        }
        HashMap<String, ArrayList> hm=new HashMap<>();
        for(String s:strs){
            char ar[]=s.toCharArray();
            Arrays.sort(ar);
            String st=String.valueOf(ar);
            if(!hm.containsKey(st)){
                hm.put(st, new ArrayList());
            }
            hm.get(st).add(s);
        }
        return new ArrayList(hm.values());
    }
}