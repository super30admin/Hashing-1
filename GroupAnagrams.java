class GroupAnagrams {

    int[] prime;
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Double, List<String>> map = new HashMap<>();
        prime = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};

        for(String str : strs) {
            double prod = primeProduct(str);
            if(!map.containsKey(prod)) {
                map.put(prod, new ArrayList<>());
            } 
            map.get(prod).add(str);
        }

        return new ArrayList(map.values());
    }

    public double primeProduct(String str) {
        double result = 1d;
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            result = result * prime[c-'a'];
        }
        return result;
    }
}