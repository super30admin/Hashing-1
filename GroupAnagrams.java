// Time complexity : O(nklog k)
// Space Complexity : O(k) k is length of string 
// sucessfully submitted on leetcode

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
     HashMap<String,List<String>> hmap= new HashMap<>();
    
    // sort each and every string
     for(int i=0;i<strs.length;i++){
         String str = strs[i];
         char[] charArr=str.toCharArray();
        Arrays.sort(charArr);
        String sortedString = String.valueOf(charArr);
         // check if your map contains the sorted string as key 
         
         if(!hmap.containsKey(sortedString)){
             hmap.put(sortedString, new ArrayList<>());
         }
            hmap.get(sortedString).add(strs[i]);
     }
        return new ArrayList<>(hmap.values());
}
}