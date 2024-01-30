//Time Complexity : n*klog(k)


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hash = new HashMap<>();
        for (int i =0; i<strs.length; i++) {
            char []characterArray = strs[i].toCharArray();
            Arrays.sort(characterArray);
            String sortedString = String.valueOf(characterArray);
            if(!hash.containsKey(sortedString)) {
                hash.put(sortedString, new ArrayList<>());
                 
            }
                hash.get(sortedString).add(strs[i]);
            }
        return new ArrayList<>(hash.values());
    }
}