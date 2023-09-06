import java.util.HashMap;
import java.util.HashSet;


//TC will be O(N) +O(NK), as N is the size to String and k is the Size of each string in the s
// Asymptotically we can say TC will be O(Nk) as given constraint says size of pattern is small. NK operation to split and traverse over the s and N is for Pattern
//SC will be O(1) because pattern consists of alphabets & they can go till 26 unique values. So max value stored in hashMap and HashSet would be 26
class WordPattern {


    public boolean wordPattern(String pattern, String s) {
        String[] strArr= s.split(" ");
        if(pattern.length()!= strArr.length){
            return false;
        }


        HashMap<Character,String > pMap= new HashMap<>();       //HashMap to store key value pair, key will be char from pattern string and
                                                                //value will be string from s.
        HashSet<String> sSet= new HashSet<>();                  //HashSet to store the unique string values from s
        for(int i=0; i<pattern.length();i++){
            char c= pattern.charAt(i);                  //To get the character from pattern string at index i
            String str= strArr[i];                      //To get the string from s at index i
            if(!pMap.containsKey(c)){                   //to check if HashMap already has char as the key or not
                pMap.put(c,str);                        //If not then add key to HashMap
                if(sSet.contains(str)){                 //If HashSet already contains the same String then return false, as it's a duplicate value
                    return false;                       // for different character
                }
                    sSet.add(str);                      //If it is not there then add it to HashSet

            }
            else {
                if (!pMap.get(c).equals(str)) {             //If key is already there in HashMap, we will check str in HashSet
                    return false;                              //If not then return false.
                }
            }
        }

        return true;                    //Return true
    }


    public static void main(String[] args){
        WordPattern obj=new WordPattern();
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(obj.wordPattern(pattern,s));
    }
}