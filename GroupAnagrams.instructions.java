//time complexity : O(N*KlogK)
//space complexity : O(N*K)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        
        for(int i=0; i<strs.length; i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String s = new String(chars);
            if(!map.containsKey(s)){
                map.put(s,new ArrayList<String>());
            }
            map.get(s).add(strs[i]);
        }

        return new ArrayList<List<String>>(map.values());
    }
}