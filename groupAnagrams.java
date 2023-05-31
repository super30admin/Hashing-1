/*
We first take a string, covvert it to a charArray and sort the strings to check if our
HashMap already encounteresd the sorted string if yes then add it to the respective list
else add the key and a new list and add the value to the list
O( k logk)
leetcode probelem no 49
*/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (int i=0;i<strs.length;i++)
        {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String str = new String(charArray);
            if(!hashMap.containsKey(str))
            {
                
               hashMap.put(str, new ArrayList<>());
        
            
            }
             hashMap.get(str).add(strs[i]);
             }
             return new ArrayList<>(hashMap.values());
}
}