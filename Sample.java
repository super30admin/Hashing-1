//Problem - 3
//Method -1
// Time Complexity : O(nklogk)
// Space Complexity : O(nk)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : yes since this is the array of strings, need to remember the syntaxes


// this method uses the aproach where the hashmap is created based on the sorted strings since the sorted string is going to be the same for the anagrams.
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs)
        {
            char[] charArr = s.toCharArray(); // String -> Character Array
            Arrays.sort(charArr);
            String sorted = String.valueOf(charArr); //Character Array -> String
            if(!map.containsKey(sorted))
            {
                map.put(sorted, new ArrayList<>());
            }
        
        map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values()); // returning the map's values in the form of the array list as per output
    }
}

//Method -1
// Time Complexity : O(nk)
// Space Complexity : O(nk)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : yes since this is the array of strings, need to remember the syntaxes

// This method includes the approach of prime product where we calculated the product as a value is provided to each character 
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<Double, List<String>> map = new HashMap<>();

        for(String s : strs)
        {
            double primeproduct = primeProduct(s);
            if(!map.containsKey(primeproduct))
            {
                map.put(primeproduct, new ArrayList<>());
            }
        map.get(primeproduct).add(s);
        }
        return new ArrayList<>(map.values()); // returning the map's values in the form of the array list as per output
    }

    private double primeProduct(String s)
    {
        double result = 1;
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i); // b
            int prime = primes[c-'a']; // b - 96 = 97-96 = 1
            result = result*prime;
        }
        return result;
    }
}


//Isomorphic Strings
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        
        HashMap<Character , Character> smap = new HashMap<>();
        HashMap<Character , Character> tmap = new HashMap<>();
        
        for(int i =0;i<s.length();i++)
        {
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            // egg  add
            if(smap.containsKey(schar))
            {
                if(smap.get(schar)!=tchar) return false;
            }
            else
            {
                smap.put(schar, tchar);
            }
            
            if(tmap.containsKey(tchar))
            {
                if(tmap.get(tchar)!=schar) return false;
            }
            else
            {
             tmap.put(tchar, schar);   
            }
            
        }
        return true;
    }
}

//Word Pattern
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap<String, Character> smap = new HashMap<>();
        HashMap<Character, String> pmap = new HashMap<>();
        String[] words = s.split(" ");
        
        //if(pattern.length()!=words.length) return false;
        
        for(int i =0;i<s.length();i++)
        {
            char pchar= pattern.charAt(i);
            String smallstring = words[i];
            
            if(pmap.containsKey(pchar))
            {
                if(pmap.get(pchar)!=smallstring) return false;
            }
            else
            {
                pmap.put(pchar,smallstring);
            }
            
            if(smap.containsKey(smallstring))
            {
                if(smap.get(smallstring)!=pchar) return false;
            }
            else
            {
                smap.put(smallstring,pchar);
            }
        }
        return true;      
    }
}