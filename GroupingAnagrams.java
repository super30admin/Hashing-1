//Time complexity: O(n(klogk+k)) | n is for the String array iteration, klogk is the time for sorting(k is the number of characters) and the +k is to lookup in the HashMap
//Space Complexity: O(nk) | n is for the number of unique strings in the array and k is the ArrayList associated with it
//The program ran successfully
/*
 Algorithm: 1. Traverse the array of Strings
            2. Sort each of the Strings 
            3. A HashMap that holds a String as a key and a list of Strings as a value is declared
            4. If the map contains the sorted String as a key: append the string to the value(List)
            5. Else put the sorted string in the map as the key and initialize a list and add the (unsorted)String as the value
            6. Add all the values(lists) in a List<List<String>> and return. 
*/
class GroupingAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        List<List<String>> answer = new ArrayList<>();
        for(String str: strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(str);
        } 
        for(List<String> list: map.values()){
            answer.add(list);
        }
        return answer;
    }
}
