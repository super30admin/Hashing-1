// Time Complexity : O(n * k log k), where n is the number of strings and k is the maximum length of a string.
// Space Complexity : O(n * k), for storing the grouped anagrams in the hashmap.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach:
// Hashing with sorted string as key.
// For each string in the input, we sort its characters to form a key.
// All strings with the same sorted version are anagrams and get grouped under the same key.
// We store these in a hashmap where key = sorted string and value = list of anagrams.
// Finally, we return all the grouped lists from the hashmap.

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        //loop through the strings
        for (int i = 0; i < strs.length; i++){//O(n)
            //Sort the string
            char[] c = strs[i].toCharArray();//O(k)
            Arrays.sort(c);//O(k logk)
            String sorted = String.valueOf(c);//O(k)
            //If the sorted string is not present add it
            if(!map.containsKey(sorted)){//O(k)
                map.put(sorted, new ArrayList<>());
            }
            //Then add value to the sorted key
            map.get(sorted).add(strs[i]);//O(k)
        }
        //Return the values of hash map
        return new ArrayList<>(map.values());
    }
}