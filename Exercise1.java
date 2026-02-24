class Solution {
    //I use a HahMap where the key is stored in sorted version of each string and the value is list of anagrams.
    //Since anagrams share identical sorted character sequences, sorting normalizes them into the same key.
    //I group all original strings under their sorted key and return all grouped values
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap <String, List<String>> map = new HashMap<>();
       for(String str : strs){
        char[] sortedArr = str.toCharArray();
        Arrays.sort(sortedArr);
        String sortedStr = String.valueOf(sortedArr);
        if(!map.containsKey(sortedStr)){
            map.put(sortedStr, new ArrayList<>()); 
        }
        map.get(sortedStr).add(str);
               }
               return new ArrayList<>(map.values());
    }
}

