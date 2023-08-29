

//O(n klogk) - 'n' number of Strings, 'k' is avg length of String.
        HashMap<String,List<String>> map = new HashMap<>();
       
        for(int i=0; i<strs.length; i++){
            String s = strs[i];
           char[] strArr = s.toCharArray();
           Arrays.sort(strArr);
           String sorted = String.valueOf(strArr);

            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);

        }
        return new ArrayList<>(map.values());
    }
}

/**
 * In Bruteforce, we can solve this problem with sorting a string and checking with nested Iterations. But the TC will ne O(n^2 k logk). To Optimize this 
 * we can reduce searching time from "n^2 to n" by using HashMap.
 * TC : O(n k logk) --> n is for searching all the string "Length of the array", K is the length of characters and logk is for sorting 
 * 
 * Even we can Optimize sorting time "logk" by using prime factorisation. This give unique number as a key. This gives TC : O(nk) with space O(nk) : n for HashMap & k for Avg size of every String 
 */


// With Time Complexity O(nk), Space Complexity O(1)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double,List<String>> map = new HashMap<>();

        
        for(int i=0; i<strs.length; i++){
            String s = strs[i];
           double primeProduct = findPrimeProduct(s);

            if(!map.containsKey(primeProduct)){
                map.put(primeProduct, new ArrayList<>());
            }
            map.get(primeProduct).add(s);

        }
        return new ArrayList<>(map.values());
    }

    private double findPrimeProduct(String s){
    int[] prime = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,87,89,97,101,103};
    double primeProduct = 1;
    for(int i=0; i<s.length(); i++){
        int idx = s.charAt(i)-'a';
        primeProduct = primeProduct*prime[idx];
    }
    return primeProduct;
}
}
