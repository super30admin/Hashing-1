class GroupAnagrams{

// Here we are using HashMap to keep key as sorted unique string and value as list of strings.
// We will take each string sort that and check if key is present if its not then we make it as key 
// otherwise will add it to list as value
// TC = nkO(k) SC = O(nk) 
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
            for(String s: strs){
                char[] arr = s.toCharArray();
                Arrays.sort(arr);
                String sorted = new String(arr); //String.valueOf(arr);
                if(!map.containsKey(sorted)){
                    map.put(sorted, new ArrayList<>());
                }
                    map.get(sorted).add(s);
            }
            return new ArrayList<>(map.values());
    }

}