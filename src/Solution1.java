// Time Complexity :O((nlogn)
// Space Complexity :O(n)

class Solution1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0){
            return new ArrayList<>();
        }
    HashMap<String,List<String>> angram= new HashMap<>();
    for(String word:strs){
       char [] chars =word.toCharArray();
       Arrays.sort(chars);
       String key = new String(chars);
       if(!angram.containsKey(key)){
        angram.put(key, new ArrayList<>());
       }
       angram.get(key).add(word);

    }
    return new ArrayList<>(angram.values());
    }
}
