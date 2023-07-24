class Solution {
    //Time Complexity :- O(n)
    //Space Complexity :- O(1)
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length ==0) return new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        //taking single single string and converting to char array for sorting
        for(String s : strs){
            char[] chr = s.toCharArray(); //converted to char array
            Arrays.sort(chr);//sorted char array
            String sorted = String.valueOf(chr);//again reasign to string or rebuilded the string
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());// putting to hashmap like key value pair where key is sorted element and for that value as a list of empty array
            }
            map.get(sorted).add(s);//adding the strings to the list of empty array or for the values
        }
        return new ArrayList<>(map.values()); //returning them by creating the list within the list
    }
}