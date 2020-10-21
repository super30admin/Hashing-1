// Time Complexity : o(nk)
// Space Complexity : o(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Leetcode : 49


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Long,ArrayList<String>> map = new HashMap<>();
        if(strs == null || strs.length==0) return new ArrayList<>();
        for(String str: strs){
            long val = primeVal(str);
            
            if(!map.containsKey(val)){
                map.put(val, new ArrayList<>());
            }
             map.get(val).add(str);

        }
        
        return new ArrayList<>(map.values());
    }
    
    private long primeVal(String str){
        int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101} ;
        long val = 1;
        for(int i = 0 ; i < str.length(); i++){
            val *= arr[str.charAt(i) - 'a'];
            
        }
        return val;
    }
}