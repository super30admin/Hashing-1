class Solution {
    
    private String sortedString(String str){
             char tempArray[] = str.toCharArray();
             Arrays.sort(tempArray);
         return new String(tempArray);
        }
    
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> hashmap = new HashMap<String,List<String>>();
        List<List<String>> anagramList =new ArrayList<List<String>>();
              
        for(int i=0;i<strs.length;i++){
           String str = sortedString(strs[i]);
            if(hashmap.containsKey(str)){
            List<String> tempList = hashmap.get(str);
            tempList.add(strs[i]);    
            }
            else{
                List<String> templist =new ArrayList<String>();
                templist.add(strs[i]);
                hashmap.put(str,templist);
                anagramList.add(hashmap.get(str));
            }
        }
        
        return anagramList;
    }
}