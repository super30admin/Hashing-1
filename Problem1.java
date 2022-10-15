//time = 12ms (faster than 79% submissions)
//Space = 55.3 MB (Less than 75% submissions)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<Double, List<String>> map = new HashMap<Double, List<String>>();

        for (String str : strs) {

            double key = getHash(str);

            if (!map.containsKey(key)) {

                List<String> mapValue = new ArrayList<>();
                map.put(key, mapValue);
            }

            map.get(key).add(str);

        }

        List<List<String>> result = new ArrayList<>();

        for (List<String> Value : map.values()) {
            result.add(Value);
        }

        return result;

    }

    private static double[] Primes = {
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101
    };

    private double getHash(String str) {

        double result = 1;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result = result * Primes[ch - 'a'];
        }

        return result;

    }

}