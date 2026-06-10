import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {         
        
        HashMap<String, List<String>> h = new HashMap<>();

        for (String s:strs){
            
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sorted = String.valueOf(c);

            if (!h.containsKey(sorted)){
                h.put(sorted, new ArrayList<String>());
            }
            h.get(sorted).add(s);
        }
        return new ArrayList<>(h.values());
    }

    public List<List<String>> groupAnagrams2(String[] strs) {         
        HashMap<BigInteger,List<String>> map = new HashMap<>();
        for (String str: strs) {
            BigInteger p = primeProduct(str);
            if (!map.containsKey(p)) {
                map.put(p, new ArrayList<>());
            }
            map.get(p).add(str);
        }
        return new ArrayList<>(map.values());
    }
    public BigInteger primeProduct(String str) {
        int[] prime = new int[] {2,3,5,7,9,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
        BigInteger result = BigInteger.ONE;
        for (int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            result = result.multiply(BigInteger.valueOf(prime[c-'a']));
        }

        return result;
    }
}