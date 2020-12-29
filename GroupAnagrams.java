import java.util.*;

/*
  Nilesh deokar
  Time Complexity : O(N)
  Space : O(N)
  Problem faced : couldn't solve using keeping a frequency of each character in each word and then comparing for anagrams
*/

class GroupAnagrams {
    public static void main(String[] args){

      String[] strs = {"eat","tea","tan","ate","nat","bat"};
      // String[] strs = {""};
      // String[] strs = {"a"};
      List<List<String>> output = groupAnagrams(strs);

      for(int i = 0; i < output.size(); i++){
        for(int j = 0; j < output.get(i).size(); j++){
            System.out.printf("%s, ", output.get(i).get(j));
        }
        System.out.println();
      }
    }

    private static List<List<String>> groupAnagrams(String[] strs){
      if(strs == null || strs.length < 1) return new ArrayList<List<String>>();


HashMap<Long, ArrayList<String>> asciiValuesMap = new HashMap<>();

for(String curr : strs){
  long primeVal = getPrimeProduct(curr);


  if(!asciiValuesMap.containsKey(primeVal)){
      asciiValuesMap.put(primeVal, new ArrayList<>());
  }

  asciiValuesMap.get(primeVal).add(curr);
}

return new ArrayList<>(asciiValuesMap.values());
}

private static long getPrimeProduct(String str){
long result = 1;
int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127,
131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199};
for (int i = 0 ; i < str.length(); i++) {
int ind = str.charAt(i) - 'a';
result = result * primes[str.charAt(i) - 'a'];
}

return result;
}

}
