//Time complexity is O(n) and spca complexity is O(n)
public class Isomorphic {
    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length())
            return false;

        char[] sArray = new char[100];
        char[] tArray = new char[100];
        for(int i =0 ; i<s.length(); i++){

            if(sArray[s.charAt(i) - ' '] == 0){
                sArray[s.charAt(i) - ' '] = t.charAt(i);
            }else{
                if(sArray[s.charAt(i) - ' '] != t.charAt(i)){
                    return false;
                }
            }
            if(tArray[t.charAt(i) - ' '] == 0){
                tArray[t.charAt(i) - ' '] = s.charAt(i);
            }else{
                if(tArray[t.charAt(i)-' '] != s.charAt(i)){
                    return false;
                }
            }
        }


        return true;
    }
}
