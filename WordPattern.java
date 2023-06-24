// Time Comlexity o(n) Space cpmlexity o(1);
import java.util.*;;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        HashSet<String> val = new HashSet<>();
        if(pattern==null || s==null) return false;
        String[] arr = s.split(" ");
        if(pattern.length() != arr.length) return false;
        for(int i=0;i<arr.length;i++)
        {
            char p = pattern.charAt(i);
            String c = arr[i];
            if(map.containsKey(p)){
                if(!map.get(p).equals(c)) return false;
                
            }
            else
            {
                if(val.contains(c)) return false;
                val.add(c);
                map.put(p,c);
            }
        }
        return true;
    }
}