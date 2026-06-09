// Time complexity is O(n^2.m)
// Space complexity is O(n · m)
// This solution is similar to word pattern

class IsIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        char[]  sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        if(sArray.length != tArray.length) return false;
        HashMap<Character, Character> map = new HashMap<>();
        for(int i= 0; i < sArray.length; i++) {
            if (map.containsKey(sArray[i])) {
                if(!map.get(sArray[i]).equals(tArray[i])) {
                    return false;
                }
            } else {
                if (map.values().contains(tArray[i])){
                    return false;
                }
                map.put(sArray[i], tArray[i]);
            }
        }
        return true;

    }
}