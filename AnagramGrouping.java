class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String> >map= new HashMap();
        for(int i=0;i<strs.length;i++){
            String word = strs[i];
            char [] letters = word.toCharArray();
            Arrays.sort(letters);
            String NewWord = new String(letters);
            if(map.containsKey(NewWord)){
                    map.get(NewWord).add(word);
            }
            else{
                List<String> words = new ArrayList<>();
                words.add(word);
                map.put(NewWord,words);
            }
        }
        List<List<String>> L = new ArrayList<>();
        for(String S : map.keySet()){
            List<String> values = map.get(S);
            L.add(values);
        }
        return L;
    }
}