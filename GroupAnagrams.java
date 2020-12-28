// Time Complexity : The time complexity is O(nk) where n is the length of the array and k is the length of maximum string.
// Space Complexity : The space complexity is O(nk) since all the string are stored in the map
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> output = new LinkedList<>();
        int[] hash = new int[26];

        Map<String,List<String>> map = new HashMap<>();

        for(int i=0;i<strs.length;i++){

            Arrays.fill(hash,0);

            //Traverse through the length of string to till the hash array
            for(int j=0;j<strs[i].length();j++){
                hash[strs[i].charAt(j) - 'a']++;
            }

            StringBuilder s = new StringBuilder();

            // create a string which is used as key in map by traversing through hash array
            for(int j=0;j<hash.length;j++){
                s.append('#');
                s.append(hash[j]);
            }

            String str = s.toString();

            // Add the string in map based on the key
            if(!map.containsKey(str)){
                map.put(str,new LinkedList<>());
            }

            map.get(str).add(strs[i]);

        }

        // Traverse through the map to add the Lists to the output
        for(String str:map.keySet()){

            output.add(map.get(str));

        }

        return output;

    }
}