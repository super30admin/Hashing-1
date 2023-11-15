// Time Complexity: O(n)
// Space Complexity: O(n)

public class GroupAnagram {
    int[] primeArray;

    public List<List<String>> groupAnagrams(String[] strs) {
        primeArray = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};

        HashMap<Double, List<String>> map = new HashMap<>();

        for(String str: strs){
            Double hash = computeHashCode(str);

            if(!map.containsKey(hash)){
                map.put(hash, new ArrayList<>());
            }
            map.get(hash).add(str);
        }
        return new ArrayList<>(map.values());
    }

    private Double computeHashCode(String str){
        Double res = 1D;
        for(Character c: str.toCharArray()){
            res *= primeArray[c - 'a'];
        }
        return res;
    }
}
