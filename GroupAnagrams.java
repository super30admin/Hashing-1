// Time complexity: O(N * k)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for(String str: strs) {
            // In java, we cannot sort it directly so we have to do it using charArray. And since we have to go over each charcater, it is O(4k) whch is O(K)
            char[] sortedArr = str.toCharArray(); //O(k)
            Arrays.sort(sortedArr); //k log k
            //Get the string out of it
            String sortedStr = String.valueOf(sortedArr); // O(k)
            if(!map.containsKey(sortedStr)){ //O(k)
                map.put(sortedStr, new ArrayList<>());
            }
                // Get a reference to the list and add it.
                map.get(sortedStr).add(str); //O(k)
        }
            return new ArrayList<>(map.values());   
        
    }
}