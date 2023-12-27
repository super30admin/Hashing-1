import java.util.HashMap;
import java.util.HashSet;

class wordSearch {
    public static void main(String[] args) {
       boolean s= wordPattern("aaa","aa aa aa aa");
        System.out.println(s);
    }
    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> hm=new HashMap();
        HashSet<String> hs=new HashSet();
        String[] sa=s.split(" ");
        if(pattern.length()!=sa.length) return false;
        for(int i=0;i<pattern.length();i++)
        {
            char schar=pattern.charAt(i);
            String ssa=sa[i];
            if(!hm.containsKey(schar)){
                if(!hs.contains(ssa)){
                    hm.put(schar,ssa);
                    hs.add(ssa);
                }else{
                    return false;
                }
            }
            if(hm.containsKey(schar)){
                if(!hm.get(schar).equals(ssa)){
                    return false;
                }
            }
        }
        return true;
    } }