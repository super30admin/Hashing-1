import java.util.HashMap;

//To check if two strings are isomorphic.
//Take two hash maps and will store the key value pair for both the strings in two HashMaps

class IsomorphicStrings{
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> s_hash= new HashMap<>();  //Declaring HashMap for string S.
        HashMap<Character, Character> t_hash = new HashMap<>();  //Declaring HashMap for string t.

        if(s.length()!=t.length()){    //If length of both the strings are not equal then they can't be isomorphic
            return false;               //return false
        }

        for(int i =0; i<s.length();i++){  //to insert values in s_hash map
            char sChar = s.charAt(i);   //to get the char at i index in String s
            char tChar = t.charAt(i);   //to get the char at i index in String t
            if(!s_hash.containsKey(sChar)){   //Add sChar S_hash map to if not there.
                s_hash.put(sChar,tChar);
            }
            else{
                if(s_hash.get(sChar)!=tChar){ //Already there in the HashMap but value does not match i.e. tchar is different then can't be isomorphic.
                    return false;
                }
            }

            if(!t_hash.containsKey(tChar)){ //Second hash map, if tChar is not there add iChar
                t_hash.put(tChar,sChar);
            }
            else{     //If already there
                if(t_hash.get(tChar)!=sChar){ //Check the value matches with the existing one
                    return false;
                }
            }
        }

        return true;   //No where false then return true.
    }


    public static void main(String[] args){
        IsomorphicStrings obj = new IsomorphicStrings();
        String s="egg";
        String t="add";
        System.out.println(obj.isIsomorphic(s,t));
    }
}