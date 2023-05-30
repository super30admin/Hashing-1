import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

       if (strs == null || strs.length ==0)
       {
           return new ArrayList<>();
       }

       Map <String, List<String>> frequencyStringsMap = new HashMap<>();

       for (String str: strs)
       {
           String freqString = getFrequency(str);
           if (frequencyStringsMap.containsKey(freqString))
           {
               frequencyStringsMap.get(freqString).add(str);
           }

           else
           {
               List<String> strList = new ArrayList<>();
               strList.add(str);
               frequencyStringsMap.put(freqString, strList);
           }
       }
       return new ArrayList<>(frequencyStringsMap.values());
    } 
        
    

    public String getFrequency(String str)
    {
        StringBuilder freqString = new StringBuilder();
        int [] freq = new int[26];

        for (char c : str.toCharArray())
        {
            freq[c-'a']++;

        }

        char c = 'a';
        for (int i : freq)
        {
            freqString.append(c);
            freqString.append(i);
            c++;
        }

        return freqString.toString();


    }
}