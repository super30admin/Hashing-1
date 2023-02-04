class Solution {
    public boolean isIsomorphic(String s, String t) {
       char[] arr1= new char[256];
       char[] arr2= new char[256];
       for(int i =0;i<s.length();i++){
           char schar= s.charAt(i);
           char tchar= t.charAt(i);
           if(arr1[schar-' ']!=0)
            {
                if(arr1[schar-' ']!=tchar) return false;
            }
            else arr1[schar-' ']= tchar;
             if(arr2[tchar-' ']!=0)
            {
                if(arr2[tchar-' ']!=schar) return false;
            }
            else arr2[tchar-' ']= schar;
       }return true;
}}