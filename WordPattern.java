import java.util.HashMap;
import java.util.HashSet;

/*
Example 1:
Input: pattern = "abba", str = "dog cat cat dog"
Output: true

Example 2:
Input:pattern = "abba", str = "dog cat cat fish"
Output: false

- so this problem is identical to the isomorphic strings, the only thing is insted of mapping to a character we are mapping to a string
- we can use the same technique as that for isomorphic strings
- with a tweak, that we have to remove the spaces from the string and store it into a character array to compare

*/

public class WordPattern {
    
    public static void main(String[] args)
    {
        String str1 = "abba";
        String str2 = "dog cat cat dog";
        boolean result  = checkIsomorphicStrings(str1, str2);

        if (result)
        {
            System.out.println("String are Isomorphic");
        }
        else{
            System.out.println("Strings are areomorphic");
        }
    }

    //Time Complexity : O(1) since we have limited our lookup time by using an hashset
    //Space Complexity : O(n) -> O(26) -> O(1) 
    //works on leetcode
    public static boolean checkIsomorphicStrings(String str1, String str2)
    {

        if(str1.length() == 0 || str2.length() == 0) return false;

        char[] ch = str1.toCharArray();
        String[] ch2 = str2.split(" ");

        if(ch.length!=ch2.length) return false;

        HashMap<Character,String> keys = new HashMap<>();
        HashSet<String> values = new HashSet<String>();

        for(int i = 0; i < ch.length; i++)
        {
            if(keys.containsKey(ch[i]))
            {
                if(!values.contains(ch2[i]) || !keys.get(ch[i]).equals(ch2[i]))
                {
                    return false;
                }
            }
            else 
            if(values.contains(ch2[i]))
            {
                return false;
            }
            else
            {
                keys.put(ch[i], ch2[i]);
                values.add(ch2[i]);
            }
        }

        return true;
        

     }



}
