class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character>smap = new HashMap<>();
        HashSet<Character>tset=new HashSet<>();

        for(int i=0;i<s.length();i++)
        {
            char schar = s.charAt(i);
            char tchar = t.charAt(i);

            if(!(smap.containsKey(schar))){
                if(tset.contains(tchar)){
                    return false;
                }
                else{
                    tset.add(tchar);
                    smap.put(schar,tchar);
                }
            }
            else
            {
                if(smap.get(schar)!=tchar){
                    return false;
                }
            }

        

        }
        return true;
    }
}
