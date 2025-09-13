/*
* The approach is to store sorted string as a key and all the words with the same letter as value 
*/

// TC: O(n * klogk) -> n to go through all the strings in the array and klogk is to sort the number of unqiue string you need to sort before putting it in the map
// SC: O(n * k) -> map to save sorted strings of max k length

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            String sorted = sortString(strs[i]);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }

    private String sortString(String str){
        char[] toSort = str.toCharArray();
        Arrays.sort(toSort);
        return new String(toSort);
    }
}