// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        // check if the string array is null or empty
        if(strs == null || strs.length == 0) return new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            // for each string in string array
            // sort each string
            char[] strArr = str.toCharArray();
            Arrays.sort(strArr);
            String sorted = String.valueOf(strArr);
            if(!map.containsKey(sorted)){
                // if the sorted string does not exist as a key in the hashmap, then add it as a key and an empty arraylist as value
                map.put(sorted, new ArrayList<>());
            }
            // add the string to the arraylist corresponding to the sorted string
            map.get(sorted).add(str);
        }
        // return lists corresponding to each sorted string in hashmap
        return new ArrayList<>(map.values());
    }
}