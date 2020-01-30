/* Problem1 : Grouping Anagrams together */

/* Optimised and efficient approach-HashMap with Prime product */
// Time Complexity : O(Nk) (N-Size of array and k-maximum length of any string in list)
// Space Complexity : O(Nk)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No. it was difficult in understanding how left and right indexes are traversed based on logic. but now it makes sense

// Your code here along with comments explaining your approach
//we will be using hashmap helping us to map keys which contains sorted characters
//then we will search for all strings containing those characters and make a link between them
//we can return elements with same characters

class Solution {
    //return list of list in output
    public List<List<String>> groupAnagrams(String[] strs) {
        //edge case
        if(strs == null || strs.length == 0) return new ArrayList<>();
        //initialise hashmap containing Long and List of strings as datatype
        //Long for storing prime product of each string and List type for maintaing list across that prime product
        HashMap<Long, List<String>> map = new HashMap<>();
        //iterate over the list and check if map contains the unique prime product
        for(String s: strs){
            //calculate and assign prime product
            //storing as long because using int might result in integer overflow as long provides 2^64 -1
            long p = calculatePrimeProduct(s);
            //check if hashmap contains product
            //1. If not, create a new list inside the list and add it
            //2. else, add the string in the list (append) across similar prime product
            if(!map.containsKey(p)){
                map.put(p, new ArrayList<>());
            }
            map.get(p).add(s);
        }
        //return final list of list
        return new ArrayList<>(map.values());
    }
    //helper function to calculate prime product
    private long calculatePrimeProduct(String s){
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
        long result = 1;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            result = result*(primes[c-'a']);
        }
        return result;
    }
}

//2nd method-Doing merge sort instead of including prime product helper function
//Time complexity: O(Nklogk)
//Space: O(Nk)

//char[] c = strs[i].toCharArray();
//Arrays.sort(c);
//String sortedWord = String.valueOf(c);

