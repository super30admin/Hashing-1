import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
Example:
Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]

- in order to group, we can calculate the hash code that forms of each string based on their ascii values and then group them together in a hashmap
- we sort and store the value of each string in the hashmap
- if the hashmap contains the code, the string get appended against that code in the hashmap

- another way would be to map the keys to prime number which will be unique so that we get unique product values 
*/

public class GroupAnagrams{

    public static void main(String[] args)
    {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> groups = new ArrayList<List<String>>();
        groups = GroupAnagrams(input);
        System.out.println("Groupings are: ");

        //display list of groups
        for(List<String> group : groups)
        {
            System.out.println("Group name : " + group.get(0));

           for (String a : group)
           {
           System.out.println(a);
           }
        }

    }

    // Time Complexity : O(nklogk)
    // Space Complexity : O(1)
    // works on leetcode
    public static List<List<String>> GroupAnagrams(String[] input)
    {
        HashMap<String, List<String>> map  = new HashMap<>();

        for(String str: input){ //n

            char[] ch = str.toCharArray();// O(k)
            
            Arrays.sort(ch); // klogk
            String sorted = String.valueOf(ch);

           if(!map.containsKey(sorted)){
               map.put(sorted, new ArrayList<>());
           }

           map.get(sorted).add(str);

        }

        return new ArrayList<>(map.values());
    }


}