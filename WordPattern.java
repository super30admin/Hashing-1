// Time Complexity : O(n)+O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
import java.util.HashMap;
import java.util.HashSet;

public class WordPattern {

    public static boolean wordPattern(String pattern, String s) {

        if(pattern == null || s == null) return false;
        String[] str = s.split(" ");

        if(pattern.length() != str.length) return false;

        HashMap<Character,String> patternKeyMap= new HashMap<>();
        HashSet<String> ValueSet = new HashSet<>();

        for(int i = 0; i < pattern.length(); i++)
        {
            char patternChar = pattern.charAt(i);
            String stringData = str[i];
            //System.out.println(stringData);
            if(!patternKeyMap.containsKey(patternChar))
            {
                if(ValueSet.contains(stringData)) return false;
                patternKeyMap.put(patternChar,stringData);
                ValueSet.add(stringData);
            }
            else {
                //System.out.println("-----------"+stringData);
                if(!patternKeyMap.get(patternChar).equals(stringData)) return false;
            }
        }
     return true;
    }
    public static void main(String[] args) {
        String pattern= "abba", t = "dog cat cat dog";
        System.out.println(wordPattern(pattern,t));
    }

}
