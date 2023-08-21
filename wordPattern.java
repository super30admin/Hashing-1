// Time Complexity : O(nk)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
import java.util.HashMap;
import java.util.HashSet;

class wordPattern {
       public boolean wordPattern(String pattern, String s) {
        String[] strArray  =s.split(" ");
        if(strArray.length != pattern.length()){
            return false;
        }
        //one hashmap and one hashset
        HashMap<Character,String> map=new HashMap<>();
        HashSet<String> set=new HashSet<>();

        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            String str=strArray[i];
            if(map.containsKey(c)){
                if(!map.get(c).equals(str)){
                    return false;
                }
            }
            else{
                if(set.contains(str)){
                    return false;
                }
                set.add(str);
                map.put(c,str);
            }
        }
        return true;
    }

    public static void main(String[] args) {
       wordPattern rs = new wordPattern();
        System.out.println(rs.wordPattern("abba","dog cat cat dog"));  // ans = true
        System.out.println(rs.wordPattern("abba","dog cat cat fish"));  // ans = false
    }

}