// Time Complexity : O(n klogk), where n is the length of strs, and k is the maximum length of a string in strs
// Space Complexity : O(nk)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No Problem faced

class Problem1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length ==0){
            return new ArrayList();
        }
        
        Map<String , List> hmap = new HashMap<>();
        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            
            String key = String.valueOf(ch);
            if(!hmap.containsKey(key)){
                hmap.put(key,new ArrayList());
                
            }
            hmap.get(key).add(s);
        }
        return new ArrayList(hmap.values());
    }
}