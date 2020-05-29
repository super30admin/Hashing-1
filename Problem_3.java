class Solution {
    public boolean wordPattern(String pattern, String str) {
        Map<Character,String> hm = new HashMap<Character,String>();
        String[] arr = str.split(" ");
        char[] p = pattern.toCharArray();
        if(arr.length != p.length){
            return false;
        }
        Set<String> set = new HashSet<>();
        for(int i = 0; i<p.length;i++ ){
            if(hm.containsKey(p[i])){
                System.out.println(p[i] + " - "+ hm.get(p[i])+" - "+arr[i]);
                if(!(hm.get(p[i])).equals(arr[i])){
                    return false;
                }
            }else{
                 if(set.contains(arr[i]))
                    return false;
                else
                {
                    set.add(arr[i]);
                    hm.put(p[i],arr[i]);
                }
            }
        }
        return true;
    }
}
