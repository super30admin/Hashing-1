/*Approach: Using hashmap to group anagrams,sorting each string and using it as a key.
If two sorted strings are equal it means they are anagram. Group anagrams in a list.

Time Complexity:o(n* k log k):
        where n is number of strings in input
        k is the average length of the input strings
        sorting is k log k. and we are sorting n strings thats why its o(n* k log k).

Space Complexity:o(n) as I will have to store all the strings in the hashmap for grouping them.
           where n is number of strings

 */
public class GroupAnagrams {
    /**
     * Given an array of strings, group all the anagrams together.
     * @param strs input strings
     * @return List of list of strings
     */
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        //Edge case
        if (strs == null || strs.length == 0)
            return result;

        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char arr[] = str.toCharArray();
            Arrays.sort( arr );
            String sortedStr = String.valueOf( arr );

            List<String> list;
            if(!map.containsKey( sortedStr )) {
                list = new ArrayList<>();
            } else {
                list = map.get( sortedStr );

            }
            list.add( str );
            map.put( sortedStr, list );
        }
        for (List<String> list : map.values()) {
            result.add( list );
        }
        return result;
    }

    /**
     * Helper method to print  lists
     * @param inputStrings
     */
    private static void printList(List<List<String>> inputStrings){
        for(List<String> innerList:inputStrings){
            for(String str:innerList){
                System.out.print(str+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        printList(groupAnagrams(input));
    }
}