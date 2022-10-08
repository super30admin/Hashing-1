import java.util.HashMap;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {


        HashMap<Character, String> map = new HashMap<>();

        String[] arr = s.split(" ");

        if( arr.length != pattern.length()){
            return false;
        }

        for( int i=0; i<pattern.length(); i++ ){

            if( !map.containsKey(pattern.charAt(i))){
                map.put(pattern.charAt(i), arr[i]);
            }

        }

        for( int i =0; i< arr.length; i++){

            if( map.get(pattern.charAt(i)).equals(arr[i])){
                continue;
            }else{
                return false;
            }

        }
        return true;

    }
}
