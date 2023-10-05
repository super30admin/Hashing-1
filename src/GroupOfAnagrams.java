import java.util.*;

public class GroupOfAnagrams {

    public List<List<String>> groupAnagrams(String[] strings){
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0;i<strings.length;i++){
            String s = strings[i];
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sorted = String.valueOf(charArr);
            if(!map.containsKey(sorted)){
                map.putIfAbsent(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        return map.values().stream().toList();
    }
}
