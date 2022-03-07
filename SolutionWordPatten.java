// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class SolutionWordPatten {
    public boolean wordPattern(String pattern, String s) {
        String[] split = s.split("\\s+");
        HashSet<String> set = new HashSet<>();
        HashMap<Character,String> hm = new HashMap<>();
        
        if(pattern.length()!=split.length){
            return false;
        }
        
        //Store each character as key against each word
        for(int i = 0; i < pattern.length(); i++){
            if(hm.containsKey(pattern.charAt(i))){
                if(!hm.get(pattern.charAt(i)).equals(split[i])){  // if keys contains but value againt current sub string is not equal to existing value in map return flase  
                    return false;
                }
            }else{
                if(set.contains(split[i])){  // if the current substring already exists or is mapped to another character return false 
                    return false;
                }else{
                    hm.put(pattern.charAt(i),split[i]);
                    set.add(split[i]);
                }
            }
        }
        
        return true; 
    }
}
