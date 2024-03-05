import java.util.HashMap;
/**
 * Time Complexity O(n)
 * Space Complexity O(1)
 */ class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        //null
        if(strs == null || strs.length == 0) return result;
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i< strs.length; i++){
            String s = strs[i];
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sorted = String.valueOf(charArr);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }
}