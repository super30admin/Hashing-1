//time complexiy n*klogk
//space complexiy o(n)
class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> map = new HashMap<String,List<String>>();
        
        for(String str : strs){
          
               char[] ar = str.toCharArray();
                Arrays.sort(ar);
                String sorted = String.valueOf(ar);
            List<String> myList= new ArrayList<String>();
           myList=  map.getOrDefault(sorted, new ArrayList<String>());
            myList.add(str);
            
            map.put(sorted, myList);
            
        }
        
        return new ArrayList(map.values());
    }
}
