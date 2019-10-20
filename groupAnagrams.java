// Time Complexity : O(n. mlogm) //m log m to sort each string
// Space Complexity : O(mn)


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        if(strs == null || strs.length == 0)
            return new ArrayList<>();

        for(int i=0; i<strs.length; i++){
            char[] c = strs[i].toCharArray(); //convert string to char array
            Arrays.sort(c); //sort the char array
            String sortedStr = Arrays.toString(c); //valueOf() converts the char array back to String
            //String sortedStr = String.valueOf(c);
            // String sortedStr = new String(c);
            // String sortedStr = String.copyValueOf(c);
            if(!map.containsKey(sortedStr))
                map.put(sortedStr, new ArrayList<>());
            map.get(sortedStr).add(strs[i]); // .get() returns a list, so add the element to it
        }
        return new ArrayList<>(map.values()); // map.values() returns a list of lists of the values, not the keys
    }
}