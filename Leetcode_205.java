//Way1
//Iterate over the two strings and maintains two maps with s to t mapping and t to s mapping. If we found any incorrect mapping in the flow, returning false. Else, we are recording correct mapping.
//TC: O(n)
//SC: O(1) --> number of keys in map is limited
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> smap=new HashMap<>();
        Map<Character,Character> tmap=new HashMap<>();

        int n=s.length(),m=t.length();
        if(n!=m){
            return false;
        }

        for(int i=0;i<n;i++){
            char sch=s.charAt(i);
            char tch=t.charAt(i);

            if((smap.containsKey(sch))){
                char curr=smap.get(sch);
                if(tch!=curr){
                    return false;
                }
            }else{
                smap.put(sch,tch);
            }

             if((tmap.containsKey(tch))){
                char curr=tmap.get(tch);
                if(sch!=curr){
                    return false;
                }
            }else{
                tmap.put(tch,sch);
            }
        }

        return true;
        
    }
}

//Way2
//Iterate over the two strings and maintains one map and one set to maintain s to t mapping and at the same time to check whether the value presennt in set or not. If we found any incorrect mapping in the flow, returning false. Else, we are recording correct mapping.
//TC: O(n)
//SC: O(1) --> number of keys in map is limited
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> smap=new HashMap<>();
        Set<Character> tset=new HashSet<>();

        int n=s.length(),m=t.length();
        if(n!=m){
            return false;
        }

        for(int i=0;i<n;i++){
            char sch=s.charAt(i);
            char tch=t.charAt(i);

            if((smap.containsKey(sch))){
                char curr=smap.get(sch);
                if(tch!=curr){
                    return false;
                }
            }else{
                if(tset.contains(tch)){
                    return false;
                }
                tset.add(tch);
                smap.put(sch,tch);
            }
        }

        return true;
        
    }
}

//Way3:
//Iterate over the two strings and maintains one array and one set to maintain s to t mapping and at the same time to check whether the value presennt in set or not. If we found any incorrect mapping in the flow, returning false. Else, we are recording correct mapping.
//TC: O(n)
//SC: O(1) --> number of keys in map is limited
class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] smap=new char[95];
        Set<Character> tset=new HashSet<>();

        int n=s.length(),m=t.length();
        if(n!=m){
            return false;
        }

        for(int i=0;i<n;i++){
            char sch=s.charAt(i);
            char tch=t.charAt(i);

            if((smap[sch - ' ']!=0)){
                char curr=smap[sch - ' '];
                if(tch!=curr){
                    return false;
                }
            }else{
                if(tset.contains(tch)){
                    return false;
                }
                tset.add(tch);
                smap[sch-' ']=tch;
            }
        }

        return true;
        
    }
}
