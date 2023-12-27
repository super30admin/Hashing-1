//Accepted on leetcode
// Firstly i was using just 1 hashmap to map and check than as dicuessed in class its not good to use contains on values than just shifted the other order to hashmap 2 and check and got it

class Solution {
    public boolean isIsomorphic(String s, String t) {

        char[] a1 = s.toCharArray();
        char[] a2 = t.toCharArray();
        int n1 = a1.length-1;
        int n2 = a2.length-1;
        HashMap<String , String> hashMap = new HashMap<>();
        HashMap<String , String> hashMap2 = new HashMap<>();
        if(n1!=n2){
            return false;
        }
        for(int i=0;i<=n1;i++){
            if(hashMap.containsKey(String.valueOf(a1[i]))){
                String value = hashMap.get(String.valueOf(a1[i]));
                if((!String.valueOf(a2[i]).equals(value)) ){
                    return false;
                }


            }
            else{
                if(hashMap2.containsKey(String.valueOf(a2[i]))){
                    return false;
                }

                hashMap.put(String.valueOf(a1[i]),String.valueOf(a2[i]));
                hashMap2.put(String.valueOf(a2[i]),String.valueOf(a1[i]));
                
                

            }
        }

        return true;



        
    }
}