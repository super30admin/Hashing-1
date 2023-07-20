//Problem1-> Group Anagrams Together
//Time Complexity: O(mlonm) can be done in O(n)
//Space Complexity: O(n) //hashmap
class Solution {
    //tc=n + nlogn (m is array length, nlogn is sorting time taken for char sort. can be done in O(n))
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res= new ArrayList<>();
        Map<String, List<String>> map=new HashMap<>(); // to store sorted string.
        for(String str: strs){
            char[] ch= str.toCharArray(); 
            Arrays.sort(ch); //sort string characters: nlogn
            String news= String.valueOf(ch); //sorted character array to string.
            if(!map.containsKey(news)){ //check if map containsKey sorted string.
                map.put(news, new ArrayList<>()); // if no then add the string with empty list in map.
                
            }
            map.get(news).add(str); // add current string to list.
        }
        return new ArrayList<>(map.values()); /// return new list of list(map.values)
    }
}

//Problem 2-> Isomorphic Strings
//Time Complexity: O(n)
//Space Complexity: O(n) //hashmap + HashSet
class Solution {
    public boolean isIsomorphic(String s, String t) {
        // with 2Hashmaps
        // Map<Character,Character>map=new HashMap<>();
        // Map<Character,Character>map2=new HashMap<>();

        // for(int i=0;i<s.length();i++){
        //     if(map.containsKey(s.charAt(i))){
        //         if(map.get(s.charAt(i))!=t.charAt(i)){
        //             return false;
        //         }
        //         continue;
        //     }

        //     if(map2.containsKey(t.charAt(i))){
        //         if(map2.get(t.charAt(i))!=s.charAt(i)){
        //             return false;
        //         }
        //         continue;
        //     }

        //     map.put(s.charAt(i),t.charAt(i));
        //     map2.put(t.charAt(i),s.charAt(i));
        // }
        // return true;

        //with Hashmap and set
        if(s.length()!=t.length())
            return false;
        Map<Character,Character> map=new HashMap<>();
        Set<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){ //check if map already has s.charAt(i)
                if(!map.get(s.charAt(i)).equals(t.charAt(i))) //check if the value is equal to t.charAt(i)
                    return false;//if not return false
            }
            else if(set.contains(t.charAt(i))) return false; //if map doesnt contain key, check if there is a pair with t.charAt(i)-> basically check if t.charAt(i) in set
            else{// if it is a new pair, add in map and set.
                map.put(s.charAt(i),t.charAt(i)); 
                set.add(t.charAt(i));
            }
                
        }
        return true;
    }
}

//Problem 3-> Word Pattern
//Time Complexity: O(n)
//Space Complexity: O(n) //hashmap + HashSet
class Solution {
    public boolean wordPattern(String pattern, String s) {
        // Map<Character, String> map=new HashMap<>();
        // String[] str= s.split(" ");
        // char[] c= pattern.toCharArray();
        // if(c.length!=str.length)
        //     return false;
        // for(int i=0;i<c.length;i++){
        //     if(map.containsKey(c[i])){
        //         if(!map.get(c[i]).equals(str[i]))
        //             return false;
        //     }
        //     else if(map.containsValue(str[i]) && !map.containsKey(c[i])){
        //         return false;
        //     }
        //     else{
        //         map.put(c[i],str[i]);
        //         System.out.print(c[i]+" "+str[i]);
        //     }
        // }
        // return true;

        //Simpler way
        Map<Character,String> map=new HashMap<>();
        Set<String> set= new HashSet<>();
        String[] word=s.split(" ");
        if(pattern.length()!=word.length)
            return false;
        for(int i=0;i<pattern.length();i++)
        {
		// for case like a b b a -> dog dog dog dog
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(word[i])){
                    //System.out.println(pattern.charAt(i+1)+":"+word[i+1]);
                    return false;
                }
            }
            else if(set.contains(word[i]))
                return false;
            else{
                map.put(pattern.charAt(i),word[i]);
                set.add(word[i]);
            }
        }
        return true;
    }
}