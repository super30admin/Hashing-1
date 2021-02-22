// TC - O(nk), k for calculating primeVal for each string
// SC - O(n)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
		// HashMap with Long and List<String>
        Map<Long, List<String>> map = new HashMap<>();
		// for each loop to iterate through strs array
        for(String s : strs){
			// calling calculatePrime method with string as parameter which will return a primeVal
            long primeVal = calculatePrime(s);
			// If map doesn't contains primeVal in Key, put primrVal and a new ArrayList in the map
            if(!map.containsKey(primeVal)){
                map.put(primeVal, new ArrayList<>());
            }
			// The common operation if primeVal is in map or not, get the value of primeVal in map and add string in arrayList
            map.get(primeVal).add(s);
        }
		// return ArrayList of map values
        return new ArrayList<>(map.values());
    }
    
	// Take first 26 prime numbers in an array, we will assign each value to alphabet and calculate the product of each alphabet. Return that product value. 
	// We are using this method, as we know the product of prime numbers is always unique and can not be achieved by non prime values.
    private static long calculatePrime(String s){
        int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        long val = 1;
        for(int i=0; i<s.length(); i++){
            val *= prime[s.charAt(i) - 'a'];
        }
        return val;
    }
}


// 2nd approach with less efficient

// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
        
//         Map<String, List<String>> map = new HashMap<>();
        
//         for(String s : strs){
//             char[] tempArr = s.toCharArray();
//             Arrays.sort(tempArr);
//             String tempString = new String(tempArr);
//             if(!map.containsKey(tempString)){
//                 map.put(tempString, new ArrayList<>());
//             }
//             map.get(tempString).add(s);
//         }
//         return new ArrayList<>(map.values());
//     }
// }