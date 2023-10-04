class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        HashMap<Character,String>map = new HashMap<>();
        HashSet<String>set = new HashSet<>();
        if(arr.length != pattern.length())
            return false;
        for(int i = 0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            System.out.println(c);
            String str = arr[i];
            System.out.println(str);
            if(map.containsKey(c)){
                if(!map.get(c).equals(str))
                    return false;
            }
            else{
                if(set.contains(str))
                    return false;
                map.put(c,str);
                set.add(str);
            }
            }
        return true;
    }
}