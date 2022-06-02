import java.util.*;
public class WordPattern {

    //Time Complexity-O(n)
    //Space Complexity-O(1)
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        HashSet<String> set=new HashSet<>();
        String strs[]= s.split(" ");

        if(strs.length!=pattern.length()) return false;

        for(int i=0;i<strs.length;i++){

            char c=pattern.charAt(i);
            if(map.containsKey(c)){
                if(!map.get(c).equals(strs[i])) return false;
            }else{
                if(set.contains(strs[i])) return false;
            }

            map.put(c,strs[i]);
            set.add(strs[i]);
        }

        return true;
    }
}
