// GROUP ANAGRAMS

// Time Complexity : O(nklogk)
// Space Complexity : O(nk)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : -


// Your code here along with comments explaining your approach

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) //Return an empty ArrayList if strs is not initialized itself or if it does not contain any elements
            return new ArrayList<>();
        HashMap<Double, List<String>> map = new HashMap<>(); //HashMap to store the hash code and the strings from strs that match the hashcode
        for(int i = 0; i <strs.length; i++){ //Loop through all the strings in strs
            String s = strs[i]; //Pick one string at a time
            double primeProduct = findPrimeProduct(s); //Hash the string
            if(!map.containsKey(primeProduct)){ //If they hashed string does not already exist in the hashmap, put it in the hashmap and initialize an arraylist to add strings that match the code
                map.put(primeProduct, new ArrayList<>());
            }
            map.get(primeProduct).add(s); //Add the string to the arraylist in the hashmap corresponding to its hash key(prime product)
        }
        return new ArrayList<>(map.values()); //Return the array list of grouped anagrams
    }

    private double findPrimeProduct(String s){
        int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103}; //Initialize 26-27 prime numbers, every english alphabet will take the value of one prime number mentioned in order
        double primeProduct = 1; //Use double to take care of integer overflow
        for(int i = 0; i < s.length(); i++){ //Loop through all the characters of the input string and multiply with the correspionding prime number
            int idx = s.charAt(i) - 'a'; //To get the index, subtract the ascii value of the character at ith index with the ascii value of lowercase a, since all the input characters are lowercase, we will get the correct index to fetch the prime number
            primeProduct = primeProduct * prime[idx]; //Multiply each character with their corresponding prime number to get the hash code
        }
        return primeProduct;
    }
}