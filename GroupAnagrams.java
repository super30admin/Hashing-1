/*
Explanation: Create a map with sorted string as key and list of anagrams as value.
If a string's sorted form is in the map, append the string to its keys. If not, initialize a new arraylist as value

Time Complexity: O(nlogn)
Space complexity: O(1)
*/

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap();
        for(String str: strs){
            //sort array
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sorted = String.valueOf(chars);
        if(!map.containsKey(sorted)){
            map.put(sorted, new ArrayList<>());
        }  
       
            map.get(sorted).add(str);
            
    }
    return new ArrayList<>(map.values());
    }
}