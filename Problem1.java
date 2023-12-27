//Accepted on leetcode
// The idea is to someone uniquely identify each group of letter in any format, used prime numebrs made a hashmap of it because array takes time searching than multiplied each letter to its corresponding prime and check that for every word and grouped similar words together.



import java.math.BigInteger;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0){
            return new ArrayList<>();
        }
        HashMap<Character,BigInteger> alphabetPrimeMap = new HashMap<>();
        HashMap<BigInteger,List<String>> f = new HashMap<>();

        alphabetPrimeMap.put('a', BigInteger.valueOf(2));
        alphabetPrimeMap.put('b', BigInteger.valueOf(3));
        alphabetPrimeMap.put('c', BigInteger.valueOf(5));
        alphabetPrimeMap.put('d', BigInteger.valueOf(7));
        alphabetPrimeMap.put('e', BigInteger.valueOf(11));
        alphabetPrimeMap.put('f', BigInteger.valueOf(13));
        alphabetPrimeMap.put('g', BigInteger.valueOf(17));
        alphabetPrimeMap.put('h', BigInteger.valueOf(19));
        alphabetPrimeMap.put('i', BigInteger.valueOf(23));
        alphabetPrimeMap.put('j', BigInteger.valueOf(29));
        alphabetPrimeMap.put('k', BigInteger.valueOf(31));
        alphabetPrimeMap.put('l', BigInteger.valueOf(37));
        alphabetPrimeMap.put('m', BigInteger.valueOf(41));
        alphabetPrimeMap.put('n', BigInteger.valueOf(43));
        alphabetPrimeMap.put('o', BigInteger.valueOf(47));
        alphabetPrimeMap.put('p', BigInteger.valueOf(53));
        alphabetPrimeMap.put('q', BigInteger.valueOf(59));
        alphabetPrimeMap.put('r', BigInteger.valueOf(61));
        alphabetPrimeMap.put('s', BigInteger.valueOf(67));
        alphabetPrimeMap.put('t', BigInteger.valueOf(71));
        alphabetPrimeMap.put('u', BigInteger.valueOf(73));
        alphabetPrimeMap.put('v', BigInteger.valueOf(79));
        alphabetPrimeMap.put('w', BigInteger.valueOf(83));
        alphabetPrimeMap.put('x', BigInteger.valueOf(89));
        alphabetPrimeMap.put('y', BigInteger.valueOf(97));
        alphabetPrimeMap.put('z', BigInteger.valueOf(101));

        for (String str : strs) {
                BigInteger m = BigInteger.ONE; // Using BigInteger for very large numbers
                char[] c = str.toCharArray();
	            for (char ch : c) {
	                BigInteger prime = alphabetPrimeMap.get(ch);
	                m = m.multiply(prime);
	            }       
            if(f.containsKey(m)){
                List<String> li = f.get(m);
                li.add(str);
                f.put(m,li);


            }
            else{
               List<String> l = new ArrayList<>();
               l.add(str);
                f.put(m,l);

            }
            m= BigInteger.ONE;

        }
        List<List<String>> listOfLists = new ArrayList<>(f.values());

        return listOfLists;
            
        
        
    }
}