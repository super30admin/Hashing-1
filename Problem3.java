// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Problem statement

class Problem3 {
    
        public boolean wordPattern(String pattern, String s) {

            String[] words = s.split(" ");

            HashMap map = new HashMap<>();

            if(pattern.length() != words.length){
                System.out.println("Hey");
                return false;
            }

            for(Integer i=0;i<pattern.length();i++){

                char p = pattern.charAt(i);

                if(!map.containsKey(p)){
                    map.put(p, i);
                }
                if(!map.containsKey(words[i])){
                    map.put(words[i],i);
                }

                if(map.get(p) != map.get(words[i])){
                    return false;
                }
            }
            return true;
        }
}
