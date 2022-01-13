class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
         List<List<String>> result = new ArrayList<List<String>>();
        
        for (String str: strs){
            char tempArray[] = str.toCharArray();
 
        // Sorting temp array using
        Arrays.sort(tempArray);
 
        // Returning new sorted string
        String key= new String(tempArray);
            
             if (map.containsKey(key)) {
                List<String> anagrams = map.get(key); 
                anagrams.add(str);
                map.put(key, anagrams);
             }
            else{
                List<String> anagrams = new ArrayList<String>(); 
                anagrams.add(str);
                map.put(key, anagrams);
            }
        }
        map.forEach((k, v)
                       -> result.add(v));
        
        
        return result;
    }
}