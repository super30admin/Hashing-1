//o(n*mlogm) is time complexity
//o(1) space complexity
// passed all leetcode cases
//used the approach discussed in class

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length==0) return new ArrayList<>();
        HashMap <String,List<String>> map = new HashMap<>();
        for(String s:strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sorted = String.valueOf(c);
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());

    }
}