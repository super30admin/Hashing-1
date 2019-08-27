//This program tells if, Given a pattern and a string str, if str follows the same pattern.
//Time complexity: O(K) Space Complexity: O(k)
//Code runs successfully on Leetcode
class Solution {
    public boolean wordPattern(String pattern, String str) 
    {
        //Split the string str into array of string by breaking it into words using white space as delimiter
        String[] words = str.split(" ");
       
        //Create a hash map 'h'
        HashMap<Character,String> h = new HashMap<>();
        //Check if either of the strings are empty or the length of both strings match
        if(words.length != pattern.length() ||words.length==0||pattern.length()==0)
        {
            //If either of the above condition does not fullfil return false as it does not follow
            return false;
        }

        //Iterate over each character in the pattern
        for(int i = 0; i < pattern.length(); ++i)
        {
            //Assign each character at index 'i' to a variable 'c' 
            
            char c = pattern.charAt(i);
            //Checking if the hash set contains c as its key
            if(h.containsKey(c))
            {
                //if the value of that particular key does not match with the word at 'i'
                if(!(h.get(c).equals(words[i])))
                {
                    //Return false as it does not follow
                    return false;
                }
            }
            //Check if the hashmap still contains the value 
            else
            {
                if(h.containsValue(words[i]))
                {
                    //if it contains return false
                    return false;
                }
                //If none of the above condition satisy then the key value pair does not exist and it needs to be inserted into the hash map.
                h.put(pattern.charAt(i),words[i]);
            }
         }
        //Else Return True because the string str follows the pattern
        return true;
    }
}