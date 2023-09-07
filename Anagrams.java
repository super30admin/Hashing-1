//Time Complexity O(nk) and space complexity O(n)
public class Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0)
            return new ArrayList<>();

        HashMap<Double, List<String>> hash = new HashMap<>();
        for(int i = 0; i<strs.length ; i++){
            double result = primeProduct(strs[i]);
            if(!hash.containsKey(result)){
                hash.put(result, new ArrayList<>());
            }
            hash.get(result).add(strs[i]);
        }

        return new ArrayList<>(hash.values());
    }
    double primeProduct(String str){
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101,102};
        double res  = 1;
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            res = res * primes[c - 'a'];
        }
        return res;
    }
}
