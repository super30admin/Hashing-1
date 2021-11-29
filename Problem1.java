//Given an array of strings, group anagrams together.
//timecomlexity : o(n)
//space complexity : o(n)
public class problem1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
         List<List<String>> output = new ArrayList<>();
         for(String str : strs){
            String sortedString = getSortedString(str);
             if(map.containsKey(sortedString)){
                 map.get(sortedString).add(str);
             }else{
                 List<String> list = new ArrayList<>();
                 list.add(str);
                 map.put(sortedString,list);
             }
         }
         for(Map.Entry<String,List<String>> m : map.entrySet()){
             output.add(m.getValue());
         }
         return output;
     }
 
     private String getSortedString(String s){
       char[] c = s.toCharArray();
         Arrays.sort(c);
         return String.valueOf(c);
     }
    
}
