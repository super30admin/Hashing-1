/* Problem 1: Group Anagrams together
*/

// Time Complexity : O(nk) where k: average size of word and n: number of strings/words in the list
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Approach 1: brute force: we will iterate formed sublist to see if word has occured already(there will be repetition in searches)
//now above solution can be optimised and we can reduce the search space and leverage hashmap
//Approach 2: HashMap, here lets take k: avg size of word and n:number of strings in the input list
//in above approach, we have to start iterating and start sorting the first string and add it in the hashmap(if its not added)
//now, we will keep adding values as list corresponding to keys(sorted string) in hashmap
//under the hood implementation, in hashmap, for keys its O(1) and for values search or add, its O(n)
//Time complexity: O(nklogk) + O(n), nklogk is for sorting strings in whole list and O(n) is for searching the space in values
//O(t)= O(nklogk) and O(s)=O(n) for values space
//Approach 3: we can use prime product approach where we can find prime product of each string and add it in key value pairs.
//this would not involve sorting string at the first place
//O(t) = O(nk), O(s) = O(n)

//Approach 3: Prime product
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //edge case
        if(strs == null) return new ArrayList<>();
        //initialising hashmap
        HashMap<Double, List<String>> map = new HashMap<>();
        //traverse over the list
        for(int i = 0; i < strs.length; i++){
            double primeProduct = calculatePrimeProduct(strs[i]);
            //check if prime product is already present in hashmap key
            if(!map.containsKey(primeProduct)){
                map.put(primeProduct, new ArrayList<>());
            }
            map.get(primeProduct).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
    
    private double calculatePrimeProduct(String s){
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103};
        double result = 1;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            result = result*primes[c - 'a'];
        }
        return result;
    }
}
//Approach 2: HashMap
// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         //edge case
//         if(strs == null) return new ArrayList<>();
//         //initialising hashmap
//         HashMap<String, List<String>> map = new HashMap<>();
//         //traverse over the list
//         for(int i = 0; i < strs.length; i++){
//             //in java, for sorting, we first need to convert string to chars and then sort it and again convert back to string
//             char[] charArray = strs[i].toCharArray();
//             //sorting
//             Arrays.sort(charArray);
//             String sorted = String.valueOf(charArray);
//             //check if sorted string is already present in hashmap
//             if(!map.containsKey(sorted)){
//                 //then add sorted string as key value
//                 map.put(sorted, new ArrayList<>());
//             }
//             //if sorted string is already present in hashmap, then add corresponding strings as values 
//             map.get(sorted).add(strs[i]);
//         }
//         return new ArrayList<>(map.values());
//     }
// }