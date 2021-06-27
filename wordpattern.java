//Time complexity = O(n)
//Space Complexity = O(n)

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] arr = s.split(" ");
        if(arr.length != pattern.length()) {
            return false;
        }
        for(int i=0; i<pattern.length(); i++){
            if(!map.containsKey(pattern.charAt(i))){
                if(map.containsValue(arr[i])){
                    return false;
                }
                map.put(pattern.charAt(i), arr[i]);
            }
            else{
                if(!(map.get(pattern.charAt(i)).equals(arr[i]))){
                    return false;
                }
            }
        }
        return true;
    }
}