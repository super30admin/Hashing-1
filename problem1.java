// Leetcode : 49 Group Anagrams
// Executed on Leetcode
// Time complexity - O(n)
// Space complexity - O(n)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        char[] temp;
        String tempString;
        char[] sorted;
        
        HashMap<String,ArrayList<String>> hashmap= new HashMap();
        
        for(int i=0;i<strs.length;i++){
            temp= strs[i].toCharArray();
            Arrays.sort(temp);
            tempString= new String(temp);
            if(!hashmap.containsKey(tempString)){
                hashmap.put(tempString,new ArrayList<String>());
            }
            hashmap.get(tempString).add(strs[i]);
        }
        
        return new ArrayList(hashmap.values());
    }
}