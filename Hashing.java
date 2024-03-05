//Problem 1 
//Time and Space O(N)
class Solution {
    public boolean isIsomorphic(String s, String t) {

        Map<Character,Character> map1 = new HashMap<>();
        Map<Character,Character> map2 = new HashMap<>();

        
        for(int i=0;i<s.length();i++){

            if(map1.containsKey(s.charAt(i))){
                if(map1.get(s.charAt(i))!=t.charAt(i)) return false;
            }

            if(map2.containsKey(t.charAt(i))){
                if(map2.get(t.charAt(i))!=s.charAt(i)) return false;
            }
            map1.put(s.charAt(i),t.charAt(i));
            map2.put(t.charAt(i),s.charAt(i));
        }
        return true;
        
    }
}


//Problem 2
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if (strs.length == 0) return new ArrayList();
        Map<String,List<String>> map = new HashMap<>();

        for(String str:strs){
            char[] ca = str.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList());
                
            }
            map.get(key).add(str);
        }
        return new ArrayList(map.values());
}

}



//Problem 3 

//time and Space Complexity O(N)
//Word Pattern
class Solution {
    public boolean wordPattern(String pattern, String s) {

        Map<Character,String> map1 = new HashMap<>();
        Map<String,Character> map2 = new HashMap<>();

        String[] str = s.split(" ");

        if(str.length!=pattern.length()) return false;

        for(int i=0;i<pattern.length();i++){

            if(map1.containsKey(pattern.charAt(i))){
                if(!map1.get(pattern.charAt(i)).equals(str[i])) return false;
            }

            if(map2.containsKey(str[i])){
                if(map2.get(str[i])!=pattern.charAt(i)) return false;
            }


            map1.put(pattern.charAt(i),str[i]);
            map2.put(str[i],pattern.charAt(i));
        }
        
        // System.out.println(Arrays.toString(str));
        return true;
        
    }
}
