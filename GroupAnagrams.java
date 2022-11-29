//https://leetcode.com/problems/group-anagrams
//Time Complexity :O(NK) where N is the size of given array and K is the average length of String
//Space Complexity :O(NK) 

class Solution1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String s=String.valueOf(charArray);
            if(!map.containsKey(s)){
                map.put(s,new ArrayList<String>());
                
            }
                map.get(s).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
