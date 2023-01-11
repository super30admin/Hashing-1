public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s:strs){
            char[] chArr = s.toCharArray();
            Arrays.sort(chArr);
            String sorted = String.valueOf(chArr);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<String>());
            }
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
     }
}

// TC - O(nklogk)
// SC - O(nk)

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double,List<String>> map = new HashMap<>();
        for(String s:strs){
            double prime_product = primeProduct(s);
            if(!map.containsKey(prime_product)){
                map.put(prime_product, new ArrayList<>());
            }
            map.get(prime_product).add(s);
        }
        return new ArrayList<>(map.values());
    }

    private double primeProduct(String s){
        double res = 1;
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int prime = primes[ch - 'a'];
            res *=prime;
        }
        return res;
    }
}

// TC - O(nk)
// SC - O(nk)