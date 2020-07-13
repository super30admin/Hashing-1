// Time Complexity: O(nlogn)
// Space Complexity : O(n)


// Approach:
//     Create a map that stores String as key & List<String> as value, loop through the string Array
//     Convert each string to char Array and sort the Array
//     Convert the char Array back to a string
//     Put the sorted key as key and add this string to the arraylist as part of values

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<>();
        for(String s : strs){
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String st = String.valueOf(temp); 
            if(!hm.containsKey(st)) hm.put(st,new ArrayList());
            hm.get(st).add(s);
        }
        return new ArrayList(hm.values());
    }
}