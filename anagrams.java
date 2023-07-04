//I Will store the sorted String as  key
//then using the sorted stringg will add
//the corresponding strings to it
//Time Complexity O(nklogk) where n
//is number of strings and k is length of String


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList();
        HashMap<String,List<String>> map = new HashMap();
        for(String str : strs){
            char[] toChar = str.toCharArray();
            Arrays.sort(toChar); //klogk
            String sortedString = String.valueOf(toChar);
            if(map.containsKey(sortedString)){
                 map.get(sortedString).add(str);
            }else{
                 map.put(sortedString,new ArrayList<>());
                 map.get(sortedString).add(str);
            }
        }
        return new ArrayList<>(map.values());
        
    }
}