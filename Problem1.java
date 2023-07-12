
//Time Complexity: O(nklog k)
// space  :  O(nk), where n is the number of strings in the input array and k is the maximum length of a string in the input array. 
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(int i = 0 ; i< strs.length ; i++){ // O(n)
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars); // O(klogk)
            String str = new String(chars);
            if(map.containsKey(str)){
                map.get(str).add(strs[i]);
            }else{
                map.put(str, new ArrayList<>(Arrays.asList(strs[i])));
            }
        }

        List<List<String>> res = new ArrayList<>();
        for(List<String> val : map.values()){
            res.add(new ArrayList<>(val));
        }
        
        return res;
        
    }
}