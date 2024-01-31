// time complexity: o(nlogn)
// space complexity O(n)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List <String>> map = new HashMap<>();
        for(String str: strs){
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sorted = String.valueOf(charArr);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        }
        return new ArrayList<>(map.values());      
    }
}