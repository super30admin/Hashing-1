
// Time complexity is O(n · k log k)
// Space complexity is O(n · k)
// The idea of the solution is to sort the strings. since anagram is reordered string
// Sort the string and check if it exists in the hashmap. If doesn't exist put the sorted
// string as key and actual string as value. If the sorted string exists get the value for it  and the string to
// value. Finally return all the values in the hashmap


class GroupAnagram {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        ArrayList<List<String>> result = new ArrayList<List<String>>();
        for(String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            // String sortedString =  new StringBuilder(new String(chars)).toString();
            String sortedString =  new String(chars);
            if(map.containsKey(sortedString)) {
                List<String> value = map.get(sortedString);
                value.add(str);
                map.put(sortedString, value);
            } else {
                List<String> value = new ArrayList<String>();
                value.add(str);
                map.put(sortedString, value);
            }
        }
        for(List<String> value : map.values()) {
            result.add(value);
        }
        return result;
    }
}