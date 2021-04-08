/*

Thought Process: Need to sort every word and map it in a hashmap of sorted word and list of anagrams

TC -> O(N KLogK) -> N to loop throught he array and K = length of the longest word present to sort 

SC -> O(NK)

*/

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();
        
        Map<String, List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            char[] wordArray = strs[i].toCharArray();
            Arrays.sort(wordArray);
            //Made mistake -> Wrote toString to convert char array to String
            String word = String.valueOf(wordArray);
            if(!map.containsKey(word))
                map.put(word, new ArrayList<>());
            // Made mistake -> Initially trying to wite it as map.put(word, map.get(word).add(strs[i]));
            map.get(word).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}