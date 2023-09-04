
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
    int n = s.length();
        int m = t.length();

        if (n!=m) return false;
        if(s.equals(t)) return true;

        java.util.Map<String, Character> map = new java.util.HashMap<>();
     
    for(int i=0; i<n; i++){
        String sKey = "s_"+s.charAt(i);
        String tKey = "t_"+t.charAt(i);
        if(!map.containsKey(sKey)) {
            map.put(sKey, t.charAt(i));
        } else {
            if(!(map.get(sKey) == t.charAt(i))) return false;
        }
        if(!map.containsKey(tKey)) {
            map.put(tKey, s.charAt(i));
        } else {
            if(!(map.get(tKey) == s.charAt(i))) return false;
        }
    } return true;
}
}
