class Solution {
    //Sorting technique
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr); //Array.sort is used for array
            String sortedString = String.valueOf(charArr); // valueOf function to convert char Array to String
            if(!map.containsKey(sortedString)){
                map.put(sortedString, new ArrayList<>());
            }
            map.get(sortedString).add(str);//list.add()
        }
        return new ArrayList<>(map.values()); //returning all values in form of ArrayList
    }

}