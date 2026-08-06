//TC: O(N)
//SC: O(N)
//Approach: 
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> res = new HashMap<>();
        for(String str: strs) {
            char[] s = str.toCharArray();
            Arrays.sort(s);
            String sortedS = String.valueOf(s);
            if(!res.containsKey(sortedS)) {
               res.put(sortedS, new ArrayList<>());
            }
             res.get(sortedS).add(str);
        }
       return new ArrayList<>(res.values());
    }
}