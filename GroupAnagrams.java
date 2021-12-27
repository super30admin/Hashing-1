import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

       HashMap<String, List<String>> map = new HashMap<>();


        for(String s : strs){

            char[] ch = s.toCharArray();

            Arrays.sort(ch);

            String key = new String(ch);

            if(map.containsKey(key)){
                map.get(key).add(s);
            }
            else{
                map.put(key,new ArrayList<String>(Arrays.asList(s)));
            }

        }

        return new ArrayList<>(map.values());

    }
}
