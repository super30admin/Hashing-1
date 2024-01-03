
//approach -2
//take individual and store it in a string. get a char array for it. 
//Sort char array
//convert that sorted array to string. 
// now, sorted string --put as key to hashmap, Arraylist as value. 
//add original string to value. 
//everytimg keep checking for sorted string, if exists add to the val else add new key-val pair 
//sorting - O(k log k), for n strings - O(nk log k);, considering Hashmap lookup constant. 
//Time - O(nk logk)
//space - O(n)

//approach-2 Optimized
/*
Assign prime number to all the charctets,prime product is unique
words with smimilar products are anagrams and can be grouped together
tc: O(n*L), sc:O(n)
*/

class Solution {
    int[] prime;

    public List<List<String>> groupAnagrams(String[] strs) {
        // base case
        // if(strs == null) return new ArrayList<>();

        prime = new int[] { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,
                97, 101, 103 };

        Map<Double, List<String>> map = new HashMap<>();
        for (String str : strs) {
            double product = findPrime(str);

            if (!map.containsKey(product)) {
                map.put(product, new ArrayList<>());
            }
            map.get(product).add(str);
        }
        List<List<String>> result = new ArrayList<>();
        // go over all the keyset and return the lists
        for (double key : map.keySet()) {
            result.add(map.get(key));
        }

        return result;

    }

    private double findPrime(String str) {

        double product = 1.0;

        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'a';
            product *= prime[index];
        }
        return product;
    }
}