class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<String,List<String>>map=new HashMap<>();
     
     
     for(String s:strs){
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        String ju = String.valueOf(ch);
        if(!(map.containsKey(ju))){
            map.put(ju,new ArrayList<>());
        }
        map.get(ju).add(s);
     }return new ArrayList<>(map.values());   
    }
}
