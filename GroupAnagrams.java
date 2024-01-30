// time complexity = N(klogk), space complexity - O(1)
//For each string, convert it into a character array, sort the array, and convert it back to a string. This sorted string serves as a key in the hashmap.
//If the sorted string is not present in the hashmap, add it along with an empty list.
//Add the original string to the list corresponding to its sorted version in the hashmap.

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sortedstr = String.valueOf(charArr);
            if(!map.containsKey(sortedstr)){
                map.put(sortedstr, new ArrayList<>());

            }
            map.get(sortedstr).add(str);
        }
        return new ArrayList<>(map.values());
        
    }
}