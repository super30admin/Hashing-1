class Pattern {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map = new HashMap<>();
        String [] arr = s.split(" ");
        if(pattern.length()!=arr.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!(map.get(pattern.charAt(i)).equalsIgnoreCase(arr[i]))){
                    return false;
                }
            }
            else{
                Set<String> set = new HashSet<>(map.values());
                if(set.contains(arr[i])){
                    return false;
                }
                map.put(pattern.charAt(i),arr[i]);
            }
        }
        return true;
    }
}