//Time Complexity =O(N)
//Space Complexity = O(2N)
class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] array = s.split(" ");
        // System.out.print(array[]);
        HashMap<Character,String> map = new HashMap<>();
        HashMap<String,Character> map2 = new HashMap<>();

        if(pattern.length() != array.length) return false;
        for(int i =0; i < pattern.length(); i++){
            if(!map.containsKey(pattern.charAt(i))){
                map.put(pattern.charAt(i),array[i]);
            }else if(!array[i].equals(map.get(pattern.charAt(i)) ))return false;

            if(!map2.containsKey(array[i])){
                map2.put(array[i],pattern.charAt(i));
            }else if(map2.get(array[i]) != pattern.charAt(i))return false;



        }
        return true;
    }
}