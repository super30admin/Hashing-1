/*
 * Approach: I am taking array of 26 length to store the count of the alphabet and keep updating the value. then once i get the count of the 
 * string then i will generate a key using the count array. I will check the exisitence of the key. if present then add to the list.
 * else create they key with empty list.
 * T.C:  O(n*k) n is length of strs and k is max length of a string inside strs.
 * S.C: O(n*k)  n is length of strs and k is max length of a string inside strs.
 *  
*/


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> hmap = new HashMap<>();


        for(String s : strs){
            int[] count = new int[26];
            Arrays.fill(count, 0);

            char[] ch = s.toCharArray();

            for(int i = 0; i<ch.length; i++){
                count[ch[i] - 'a'] += 1;
            }

            StringBuilder keyStr = new StringBuilder();
            for(int i : count){
                if(i >= 10) keyStr.append("0"+i);
                else keyStr.append(i);
            }

            String outPut = keyStr.toString();

            if(!hmap.containsKey(outPut)) hmap.put(outPut, new ArrayList<>());
            hmap.get(outPut).add(s);

        }
        
    return new ArrayList<>(hmap.values());
    }
}