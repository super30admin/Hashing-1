

public class GroupAnagrams {
    public static java.util.List<java.util.List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) 
            return new java.util.ArrayList<>();

        java.util.HashMap<Double, java.util.List<String>> map = new java.util.HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            double primeKey = getPrimeProduct(str);
            System.out.println(primeKey);
            System.out.println(primeKey);
            if(!(map.containsKey(primeKey))) {
                map.put(primeKey, new java.util.ArrayList<String>());
            }
            map.get(primeKey).add(str);
            
        }
        return new java.util.ArrayList<>(map.values());
    }

        static double getPrimeProduct(String str) {
            int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61,    67, 71, 73, 79, 83, 89, 97, 101, 103};
            double result = 1;
            for (int i = 0; i<str.length(); i++) {
                char c = str.charAt(i);
                result = result * primes[c - 'a'];
            }
            return result;
        }

        public static void main(String[] args) {
            groupAnagrams(new String[] {"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"});
        }
}
