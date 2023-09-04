import java.util.HashMap;

//TC - O(n)
//SC O(2n)
// question - Given two strings s and t, determine if they are isomorphic. Two strings are isomorphic if the characters in s can be replaced to get t. 
//All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();
        

        for(int i=0; i<s.length(); i++){
            if(!mapS.containsKey(s.charAt(i))){
                mapS.put(s.charAt(i), t.charAt(i));
            }else{
                if(mapS.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }
            if(!mapT.containsKey(t.charAt(i))){
                mapT.put(t.charAt(i), s.charAt(i));
            }else{
                if(mapT.get(t.charAt(i)) != s.charAt(i)){
                    return false;
                }
            }
        }

        return true;

    }

    public static void main(String args[]){
        IsomorphicStrings i = new IsomorphicStrings();

        String s="egg", t="add";
        boolean result = i.isIsomorphic(s,t);
        System.out.println("Are "+s+ " and "+t+" ismorphic "+result);

        String a="foo", b="bar";
        boolean result1 = i.isIsomorphic(a,b);
        System.out.println("Are "+a+ " and "+b+" ismorphic "+result1);
    }
}