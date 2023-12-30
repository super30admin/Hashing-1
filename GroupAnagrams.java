
class GroupAnagrams {
    int[] prime = new int[]{
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
            31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
            73, 79, 83, 89, 97, 101
    };

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            double primeProduct = findPrimeProduct(strs[i]);
            if(!map.containsKey(primeProduct)) {
                map.put(primeProduct, new ArrayList<>());
            }
            map.get(primeProduct).add(strs[i]);
        }

        return new ArrayList<>(map.values());

    }

    public double findPrimeProduct(String word) {
        double primeProduct = 1;
        for (char letter : word.toCharArray()) {
            primeProduct *= prime[letter-'a'];

        }
        return primeProduct;
    }
}