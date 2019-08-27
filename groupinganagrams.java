//Here for a given array of strings the anagrams are identified and grouped into separate arrays.
//Time Complexity O(N K log K) (My understanding from class: O(K log K) for sorting and O(N) for intering over strings for anagram) =>(Doubt: wanted to confirm if this understanding is correct?)
//Space Complexity O(N k) (based on the data stored in the ouput)
//Ran the code on Leetcode and got accepted on submission as well. (order of the output was different from that of expected but it still got accepted.)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Checking if the given list itself is empty
        if(strs.length == 0)
        {
            //Return an empty array list
            return new ArrayList();
        }
        
        //Instantiate a hash map
        Map <String,List> output = new HashMap <String,List> ();
        
        //iterating over each string
        for (String s: strs)
        {
            
            char [] chararray = s.toCharArray(); //It returns a newly allocated character array
            Arrays.sort(chararray); //sorts the character array in ascending order
            //stores as the key
            String Key = String.valueOf(chararray); //returns the string representation of chararray 
            //If the key does not already exist in output hashmap
            if(!(output.containsKey(Key)))
            {
                //Create a new array and add the key
                output.put(Key,new ArrayList());
            }
            // add the value to the corresponding key in the hash map
            output.get(Key).add(s);
    
        }
        //else return empty list
        return new ArrayList(output.values());
    }
}