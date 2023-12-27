//Accepted on leetcode
//The idea is same as isomorphic strings just stored words here and used 2 hashmap approc

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] a1 = pattern.split("");
        String[] a2 = s.split(" ");
        int n1 = a1.length-1;
        int n2 = a2.length-1;
        if(n1!=n2){
            return false;
        }
        HashMap<String , String> hp = new HashMap<>();
        HashMap<String , String> hp2 = new HashMap<>();

        for(int i=0;i<=n1;i++){
            if(hp.containsKey(a1[i])){
                String val = hp.get(a1[i]);
                if(!val.equals(a2[i])){
                    return false;
                }
            }
            else{
                if(hp2.containsKey(a2[i])) return false;
                hp.put(a1[i],a2[i]);
                hp2.put(a2[i],a1[i]);
            }
        }
        return true;
        
    }
}