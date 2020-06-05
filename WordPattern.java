class Solution {
    public boolean wordPattern(String pattern, String str) {
       String [] strArray = str.split(" ");
        char p[] = pattern.toCharArray();
        if(p.length != strArray.length) return false;
        HashMap<Character,String> map = new HashMap<>();
        for (int i=0;i<pattern.length();i++){
        if(map.containsKey(p[i])&& !map.get(p[i]).equals(strArray[i])) return false;
        if(!map.containsKey(p[i]) && map.containsValue(strArray[i])) return false;
        map.put(p[i],strArray[i]);
    }
        return true;
    }
    }
	
	Time Complexity : O(n square)
	Space Complexity : O(n)