// Create a Hashmap. Sort the string and add it as a key if it is not present. 
//If the key is already present then create an ArrayList and add that string to the arraylist
//TC - O(nklog K) where n is the no of strings and k is the average size of the strings

class AnagramsGroup {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : strs) {
            char[] charStr = s.toCharArray();
            Arrays.sort(charStr);
            String sortedStr = String.valueOf(charStr);
            if(!map.containsKey(sortedStr)){
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(s);
        }
        return new ArrayList<>(map.values());
    }
}