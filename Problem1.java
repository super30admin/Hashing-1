
// Group anagrams
//O(n) spave complexity for extra hash map space
// O(n) time complexity


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] strCharArray = str.toCharArray();
            Arrays.sort(strCharArray);
            String strSortedString = new String(strCharArray);
            if(!map.containsKey(strSortedString)){
                map.put(strSortedString, new ArrayList<>());
            }
      
            
                map.get(strSortedString).add(str);
            

        }
        return new ArrayList<>(map.values());
    }
}
