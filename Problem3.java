// This is the exact same problem as the problem 2, except instead of two strings,
// we get one string and a collection of strings. In this solution, I am  comparing
// each character in pattern to a string in s, which is separated by whitespaces. 

//Time:O(n) + O(m) where n is length of s and m is length of t
//Space: O(n+m)

import java.util.HashMap;

public class Problem3 {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> pMap = new HashMap<>();
        HashMap<String,Character> sMap = new HashMap<>();
        String[] splited = s.split(" ");
        if(splited.length != pattern.length()){
            return false;
        }
        for(int i = 0;i<pattern.length();i++){
            Character ps = pattern.charAt(i);
            String ss = splited[i];
            if(!pMap.containsKey(ps)){
                pMap.put(ps,ss);
            }
            if(pMap.get(ps).equals(ss) == false){
                return false;
            }       
        }
        for(int i = 0;i<pattern.length();i++){
            Character ps = pattern.charAt(i);
            String ss = splited[i];
            if(!sMap.containsKey(ss)){
                sMap.put(ss,ps);
            }
            if(sMap.get(ss)!=ps){
                return false;
            }       
        }
        return true;
    }
}
