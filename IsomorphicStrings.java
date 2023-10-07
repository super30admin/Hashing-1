import java.util.HashMap;
import java.util.HashSet;

//we need to check if when we replace the character from first string form the second string correctly
// to do this, we will first have a hashmap with key and value and hashset with only the values
// if the key exists then we will check if the value in the second string is in the hashset and the corresponding value is equal to the character in second string we are on
//if not, then we add it to the hashmap following the hashset
// works on leetcode


public class IsomorphicStrings {
    public static void main(String[] args)
    {
        String str1 = "eggt";
        String str2 = "dffg";
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
    public static boolean checkIsomorphicStrings(String str1, String str2)
    {

        if((str1.length()!=str2.length()) || str1.length() == 0 || str2.length() == 0) return false;

        char[] ch = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        HashMap<Character,Character> keys = new HashMap<>();
        HashSet<Character> values = new HashSet<Character>();

        for(int i = 0; i < ch.length; i++)
        {
            if(keys.containsKey(ch[i]))
            {
                if(!values.contains(ch2[i]) || keys.get(ch[i]) != ch2[i])
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
