import java.util.HashMap;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {

        HashMap<String, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> map = new HashMap<>();

        String[] arr = s.split(" ");

        if( arr.length != pattern.length()){
            return false;
        }


        for( int i=0; i<arr.length; i++ ){

            char c = pattern.charAt(i);
            String word = arr[i];

            if( !map.containsKey(c)){
                map.put(c,i);
            }

            if( !smap.containsKey(word)){
                smap.put(word,i);
            }

            if( !map.get(c).equals(smap.get(word))){
                return false;
            }

        }
        return true;

    }
}
