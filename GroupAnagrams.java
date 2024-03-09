// Time Complexity : O(nklogk) where 'n' is the length of the string.
// Space Complexity : O(nk) where 256 is the length of ASCII i.e. O(1)
// Did this code successfully run on Leetcode : Yes, https://leetcode.com/problems/group-anagrams/
// Any problem you faced while coding this : No


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if(strs==null||strs.length()==0) return result;
        HashMap<String,List<String>> map = new HashMap<>();
       for(int i=0;i<s.length();i++){ //n
           String s = strs[i];
           char[] charArr = s.toCharArray();
           Arrays.sort(charArr); //klogk
           String sorted = new String(charArr);
           if(!map.containsKey(sorted)){ // O(k)
               map.put(sorted,new ArrayList<>());
           }
            map.get(sorted).add(s);
       }
       result.addAll(map.values()); //O(n)
       return result;
    }
}
