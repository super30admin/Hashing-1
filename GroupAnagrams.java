// Time Complexity : O(nklog(k)) Here k is the length of each string 
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){

            char[] arr=strs[i].toCharArray();
            Arrays.sort(arr); 
            String s=String.valueOf(arr);
            if(!map.containsKey(s)){
                map.put(s,new ArrayList<>());
            }
                map.get(s).add(strs[i]);
            
        }
       return new ArrayList<>(map.values());
    }
}