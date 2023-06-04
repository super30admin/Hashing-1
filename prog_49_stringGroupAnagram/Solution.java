package prog_49_stringGroupAnagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
public List<List<String>> groupAnagrams(String[] strs) {
        //In this solution we are sorting the pattern of string as a key and store respective string as value as Arraylist
        //{ abt {bat,tab},
        //ant {nat, ant, tan}
        // aet {eat, tea, ate}
        //}

        HashMap<String, List<String>> storage = new HashMap<> ();
        for(String s : strs){
        char[] strArr = s.toCharArray() ;
        Arrays.sort(strArr); // klogk where k is length of string
        String s1 = String.valueOf(strArr);
        if(!storage.containsKey(s1)){ //k
        ArrayList<String> list = new ArrayList<>();
        list.add(s);
        storage.put(s1,list);
        }
        else{
        storage.get(s1).add(s);
        }

        }

        return new ArrayList<>(storage.values());

        }
        }
