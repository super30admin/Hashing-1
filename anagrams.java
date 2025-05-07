//Time Complexity : O(Nlog N)
//In this question we will first sort the keys and store them using a hashmap and will finally get all values based on the keys of sorted strings

public class groupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupedAnagrams = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] character = s.toCharArray();
            Arrays.sort(character);
            String SortedKey = new String(character);
            //after sorting it is again converted back to String
            if(!map.containsKey(SortedKey))
                map.put(SortedKey,new ArrayList<>());

            map.get(SortedKey).add(s);
        }
        groupedAnagrams.addAll(map.values());
        return groupedAnagrams;
    }
    public static void main (String[] args){
        String [] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println(groupAnagrams(strs));
    }
}
