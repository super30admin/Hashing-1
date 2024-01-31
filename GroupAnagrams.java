class Solution {
    public int[] primeNumbers;
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        if (strs == null || strs.length == 0) {
            return result;
        }
        this.primeNumbers = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        HashMap<Double, List<String>> map = new HashMap<>();
        for (String str : strs) {
            double res = getPrimeProduct(str);
            if (!map.containsKey(res)) {
                map.put(res, new ArrayList<>());
            }
            map.get(res).add(str);
        }
        return new ArrayList<>(map.values());
        
    }

    private double getPrimeProduct(String str) {
        double res = 1;

        for (char c : str.toCharArray()) {
            res = res * this.primeNumbers[c - 'a
            '];
        }

        return res;
    }
}