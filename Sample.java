//****ISOMORPHIC STRINGS= USING HASHMAP****
//Time complexity: length of the string: o(n);
//Space complexity:As we are using 2 hashmap to maintain the mappings o(n)+o(n)= o(2n) =>*o(n)*
//Leetcode runnable: Y;
//Any questions : No;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> smap= new HashMap<>();
        HashMap<Character, Character> tmap= new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            char st=s.charAt(i);
            char tt=t.charAt(i);
            
            if(smap.containsKey(st))
            {
                char copy=smap.get(st);
                if(copy!=tt)
                {
                    return false;
                }
            }
            else
            {
                smap.put(st, tt);
            }
            
            //tmapping
            if(tmap.containsKey(tt))
            {
                char copyx=tmap.get(tt);
                if(copyx!=st)
                {
                    return false;
                }
            }
            else
            {
                tmap.put(tt, st);
            }
            
        }
        return true;
    }
}

//****ISOMORPHIC STRINGS= USING CHARACTER ARRAY****
//Time complexity: length of the string: o(n);
//Space complexity:As we are using 2 ARRAYS to maintain the mappings o(n)+o(n)= o(2n) =>*o(n)*
//Leetcode runnable: Y;
//Any questions : No;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        char [] smap= new char[256];
        char [] tmap= new char[256];
        
        for(int i=0;i<s.length();i++)
        {
            char st=s.charAt(i);
            char tt=t.charAt(i);
            
            if(smap[st - ' ']!=0)
            {
                if(smap[st - ' '] !=tt)
                {
                    return false;
                }
                
            }
            else
            {
                smap[st - ' ']= tt;
            }
            
            //tmapping
            if(tmap[tt - ' ']!=0)
            {
                if(tmap[tt - ' ']!=st)
                {
                    return false;
                }
                
            }
            else
            {
                tmap[tt - ' ']= st;
            }
            
        }
        return true;
    }
}

//****GROUP ANAGRAMS:o(n)+o(klogk+k****
//Time complexity: Length of array o(n), length of the string o(k), Sorting every string o(klogk) ::::::: o(n)+o(klogk+k);
//Space complexity:0(1);
//Leetcode runnable: Y;
//Any questions : No;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s: strs)
        {
            char[] arr= s.toCharArray();
            Arrays.sort(arr);
            String sorted= String.valueOf(arr);
            
            if(!map.containsKey(sorted))
            {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        
        return new ArrayList<>(map.values());
    }
    
}
//****GROUP ANAGRAMS:o(n*k)****
//Time complexity:o(n*k) where n is length of given array and k is the max length of string in the array;
//Space complexity:0(1)
//Leetcode runnable: Y
//Any doubts: N

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double, List<String>> map = new HashMap<>();
        for(String s: strs)
        {
            double prime= primeproduct(s);
            
            if(!map.containsKey(prime))
            {
                map.put(prime, new ArrayList<>());
            }
            map.get(prime).add(s);
        }
        
        return new ArrayList<>(map.values());
    }
    
    private double primeproduct(String s)
    {
    int[] primes={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
        double result=1;
        
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            result= result*primes[c - 'a'];
        }
        return result;
    }
    
}
