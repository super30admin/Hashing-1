/*
 * Time Complexity : O(n)
 * Space Complexity :  O(n)
 * Did this code successfully run on Leetcode : yes
 * Any problem you faced while coding this : No
 * 
 * Approach - For every word in the array we find the prime product. If the prime sum exists then we push the word to the list mapped to the sum. Else, we insert the prime sum and the word into 
 * the hashmap. Prime product is the product of the prime number equivalent of the all characters in the string.
 */

//https://leetcode.com/problems/group-anagrams/description/

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double, List<String>> aMap = new HashMap<>();
        double result;
        for(int i=0;i<strs.length;i++){
            result = primeSum(strs[i]);
            if(!aMap.containsKey(result)){
                aMap.put(result,new ArrayList<String>());
            }
            aMap.get(result).add(strs[i]);
        }
        return new ArrayList<>(aMap.values());
    }

    private double primeSum(String str){
        double result=1;
        int[] primenumbers = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        for(int i=0;i<str.length();i++){
            result*=primenumbers[str.charAt(i)-'a'];
        }
        return result;
    }
}