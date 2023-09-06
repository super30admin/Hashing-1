import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    //For a given list of strings need to return the list of group of strings those are anagrams.
    //Will use the HashMap to create a key value pair, key will be sorted string and value will be the list of strings with same sorted string key.
    //Will return the List of combined values of HashMap.
    //TC will be O(N K log K), where N is the size of List and K is the size of each string in the list. It will take K log K time to sort 1 string
    // and there are N strings in the list.
    //SC will be O(K*N), we can say O(N) as the given length of given string is< 100
    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs==null || strs.length==0){       //Condn to check if List is empty or not
            return new ArrayList<>();           //If empty return empty arrayList
        }
        HashMap<String, List<String>> smap= new HashMap<>();   //Declare HashMap in which key is String and Value will have List of Strings.

        for(int i=0;i<strs.length;i++){      //To traverse over each string in the list.
            String str= strs[i];                //Return string at each index
            char[] chars= str.toCharArray();  //Can't sort string, so sort each char of string into an array
            Arrays.sort(chars);                 //Inbuilt fxn to sort array.
            String sorted = String.valueOf(chars);  //To get the string value back.

            if(!smap.containsKey(sorted)){          //Condn to check if sorted array already exists
                smap.put(sorted,new ArrayList<>());   //If not then create a key and a corresponding ArrayList to store values.
            }
            smap.get(sorted).add(str);        //Once key is created or if it already exists then add the original string.
        }
        return new ArrayList<>(smap.values());          //Need to return one list of all the grouped strings stored in sub lists.
    }


    public static void main(String[] args){
        GroupAnagrams obj = new GroupAnagrams();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(obj.groupAnagrams(strs));
    }
}
