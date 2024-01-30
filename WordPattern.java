//time complexity - O(N), space complexity - O(1)
//The algorithm uses a HashMap to store the mapping between characters in the pattern and corresponding words in the string. It also uses a HashSet to check for duplicate words.
class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> map = new HashMap<Character, String>();
        HashSet<String> set = new HashSet<>();
        int n = pattern.length();
        String[] words = str.split(" ");
        int m = words.length;
        //System.out.println(m+""+n);
        if(n != m) return false;
        if(pattern == null || str == null) return false;
        if(pattern == null && str == null) return false;
        for(int i=0; i<n; i++){
        if(map.containsKey(pattern.charAt(i))){
            //System.out.println(map.get(pattern.charAt(i))+" "+words[i]);
            if(!map.get(pattern.charAt(i)).equals(words[i])) return false;
        }
        else{
            if(set.contains(words[i])) return false;
            map.put(pattern.charAt(i), words[i]);
            //System.out.println("else"+ pattern.charAt(i)+" "+words[i]);
            set.add(words[i]);

        }

        } return true;
        
    }
}