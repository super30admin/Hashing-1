// Time Complexity : O(n*klog(k))  // n number of strings and klogk to sort a string where k represents length of string
// Space Complexity : O(n*k)  // not sure about space complexity 
// Did this code successfully run on Leetcode  : Yes
// Any problem you faced while coding this : No 
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<String,List<String>>();
        for(String s : strs) 
        {
           char [] arr = s.toCharArray();
           Arrays.sort(arr);                  // sort string to form key
           String key = new String(arr);
           if(map.containsKey(key)) // if key already present
           {
               List<String> temp = map.get(key); // add to the list 
               temp.add(s);
               map.put(key,temp);
           }else{
               map.put(key,new ArrayList<String>()); // add a new list 
               List<String> temp = map.get(key); // add value to the new list for that key
               temp.add(s);
               map.put(key,temp);
           }
        }
        List<List<String>> result = new ArrayList<>(map.values()); // Get all the values in the map
        return result;
    }
}