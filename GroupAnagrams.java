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


      HashMap<String, Integer> asciiValuesMap = new HashMap<String, Integer>();

        for(String curr : strs){

            int sum = 0;
            for (int  i = 0; i < curr.length() ; i++) {
              sum += curr.charAt(i);
            }
            asciiValuesMap.put(curr,sum);
        }

        List<List<String>> output = new ArrayList<List<String>>();
        Set<Integer> addeditemset = new HashSet<>();
        for(int i = 0; i < strs.length ; i++){
          if(addeditemset.contains(i)){
            continue;
          }
          List<String> currentRow = new ArrayList<String>();
          currentRow.add(strs[i]);

          for(int j = i+1; j < strs.length; j++){
            if(asciiValuesMap.get(strs[i]).intValue() == asciiValuesMap.get(strs[j]).intValue()){
                currentRow.add(strs[j]);
                addeditemset.add(j);
            }
          }
          output.add(currentRow);
        }

        return output;
    }

}
