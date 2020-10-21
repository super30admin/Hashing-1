// Time Complexity :O(nlogn)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes 
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// Sort chars in a string and use it as a key in HashMap

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(null == strs || strs.length == 0){
            return new ArrayList<List<String>>();
        }
        
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for(String str: strs){
            char ch[] = str.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(str);
        }
                
        return new ArrayList<List<String>>(map.values());
        
    }
}
