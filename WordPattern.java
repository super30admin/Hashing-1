//Time Complexity = O(n)
//Space Complexity = O(MAX_CHAR)

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if(pattern.length() != arr.length){
            return false;
        }
        Map<Character,Integer> m1 = new HashMap<>();
        Map<String,Integer> m2 = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(!m1.containsKey(pattern.charAt(i))){
                m1.put(pattern.charAt(i),i);
            }
            if(!m2.containsKey(arr[i])){
                m2.put(arr[i],i);
            }
            if(m1.get(pattern.charAt(i)) != m2.get(arr[i])){
                return false;
            }
        }
        return true;
    }

    public static void main(){
        Solution sol = new Solution();
        String pattern = "abba";
        String s = "dog cat cat dog";

        Boolean checkWordPattern = sol.wordPattern(pattern,s);
        system.out.print('Check -- '+checkWordPattern);

        pattern = "abba";
        s = "dog cat cat fish";

        checkWordPattern = sol.wordPattern(pattern,s);
        system.out.print('Check -- '+checkWordPattern);
    }
}