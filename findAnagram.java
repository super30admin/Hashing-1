// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //check the null condition
        if(strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs) {
            //convert the string to char array and sort it
            char [] charArr = str.toCharArray();
            Arrays.sort(charArr);
            //get the sorted string
            String sortedString = String.valueOf(charArr);
            //if sorted string is not in map then add it 
            if(!map.containsKey(sortedString)) {
                map.put(sortedString, new ArrayList<>());
            }
            map.get(sortedString).add(str);
            
        }
       return new ArrayList<>(map.values());
    
    }
}