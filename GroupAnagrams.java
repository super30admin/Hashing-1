//Time Complexity: nklog(k)+n
//Space Complexity: O(nk)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            
            String sortedStr = new String(arr);
            if(!map.containsKey(sortedStr)){
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(str);
        }
        List<List<String>> out = new ArrayList<>();
        for(List<String> value : map.values()){
            out.add(value);
        }
        return out;
    }
}