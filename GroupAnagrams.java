/**
Time Complexity - O(n * mlog(m)) 
    n is the number of strings in input. 
    m is the length of the longest string in n. 
Space Complexity - O(n)
 */
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> result = new ArrayList<>();
        if(strs == null || strs.length == 0)
            return result;
        
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs) {
            char[] chStr = str.toCharArray();
            Arrays.sort(chStr);
            String newStr = new String(chStr);
            if(!map.containsKey(newStr)) {
                map.put(newStr, new ArrayList<String>());
            }
            List<String> list = map.get(newStr);
            list.add(str);
            map.put(newStr, list);
        }

        for(String key : map.keySet()) {
            result.add(map.get(key));
        }

        return result;
    }
}
