// Time: if l = longest string length, O(n*l*log(l))
// Space: O(n*l)
// It ran on leetcode
// No problems faced while coding

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, LinkedList<String>> map = new HashMap<>();

        for(String s: strs){
            char[] ar = s.toCharArray();
            Arrays.sort(ar);
            String a = String.valueOf(ar);
            if(!map.containsKey(a)){
                map.put(a, new LinkedList<>());
            }
            map.get(a).addFirst(s);
        }

        List<List<String>> result = new LinkedList<>();

        for(Map.Entry<String, LinkedList<String>> entry: map.entrySet()){
            result.addFirst(entry.getValue());
        }

        return result;
        
    }
}
