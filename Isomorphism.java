class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character>mapst = new HashMap<>();
        Map<Character,Character>mapts = new HashMap<>();
        for(int i =0;i<s.length();i++){
            char chs = s.charAt(i);
            char cht = t.charAt(i);
            if(mapst.containsKey(chs) && mapst.get(chs)!=cht ||mapts.containsKey(cht) && mapts.get(cht)!=chs)
                return false;
            mapst.put(chs,cht);
            mapts.put(cht,chs);
        }
        return true;
    }
}
