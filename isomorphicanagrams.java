//The aim of  this program is to check if 2 given strings are Isomorphic
//This soulution is attempted using 2 Hashmaps
//My understanding on Isomorphic strings is that, each occurance of character in a string can be replaced by other characyers to give the second string without compromising its order of occurance as well.
//Doubt: Do correct me if my understanding about Isomorphic strings are not correct!
//Have attempted 2 solutions: First as per my understanding from class second solution is something I tried using just a single for loop and single hashmap and contains function. Both runs correctly on leetcode and was accepted on submisson.
//time complexity: O(N) space complexity: O(K) (depending on the length of string..)

//####### Solution 1 #############
class Solution {
    public boolean isIsomorphic(String s, String t) 
    {
        //first hashmap 'h1' initialized for first string 's' and the type of key and value type is char
        HashMap<Character,Character> h1 = new HashMap<>();
        //Iterating through the string 's'
        for (int i = 0; i<s.length();i++)
        {
            //Checking if the char in 's' is in hashmap it wont be null if it exist in hash map
            if(h1.get(s.charAt(i))!= null)
            {
                //If that char in 's' exist as a key in hashmap we get its corresponding value and check if it is the same as the value present in 't' string at the same index 'i'
                if(h1.get(s.charAt(i))!=t.charAt(i))
                {
                    //If not it does not fullfill isomorphic property return false
                    return false;
                }
            }
            else
            {
                //If it does not exist already in the hash map add them as key value pair: char in 's' as key and char in 't' as its value
                h1.put(s.charAt(i),t.charAt(i));
            }
            
        }

        //first hashmap 'h2' initialized for second string 't' and the type of key and value type is char
        HashMap<Character,Character> h2 = new HashMap<>();
        //Iterating through the string 't'
        for(int i=0; i<t.length();i++)
        {
            //Checking if the char in 't' is in hashmap it wont be null if it exist in hash map
            if(h2.get(t.charAt(i))!= null)
            {
                 //If that char in 't' exist as a key in hashmap we get its corresponding value and check if it is the same as the value present in 's' string at the same index 'i'
                if(h2.get(t.charAt(i))!=s.charAt(i))
                {
                    //If not it does not fullfill isomorphic property return false
                    return false;
                }
            }
            else
            {
                //If it does not exist already in the hash map add them as key value pair: char in 't' as key and char in 's' as its value
                h2.put(t.charAt(i),s.charAt(i));
            }
            
        }
        //Return true if all the above conditions are not true as it then fullfills all properties of isomorphic strings
        return true;
    }
}

//############### Solution 2 #################
public class Solution {
    public boolean isIsomorphic(String s, String t) {

        //first hashmap 'h' initialized and the type of key and value type is char
        HashMap<Character, Character> h = new HashMap<Character, Character>();
        //Iterating through the string 's'
		for (int i = 0; i < s.length(); i++) {
            //If that char in 's' exist as a key in hashmap 'h' 
			if (h.containsKey(s.charAt(i))) {
               // we get its corresponding value and check if it is the same as the value present in 't' string at the same index 'i'
                if (t.charAt(i) != h.get(s.charAt(i)))
                //If not it does not fullfill isomorphic property return false 
                    return false;
            //If above conditions are not fullfilled check if the char in i index of 't' string still happens to exist as a value for some other key in hashmap 
			} else if (h.containsValue(t.charAt(i))) {
                //If this is true then return false
				return false;
            }
            //If both key value does not exist in hashmap add them as key value pair into hashmap
			hashMap.put(s.charAt(i), t.charAt(i));
        }
        //else return true
		return true;
    }
}