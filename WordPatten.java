import java.util.HashMap;

public class WordPatten {

    public boolean wordPattern(String pattern, String s) {

        HashMap<Character, String> mapC = new HashMap<>();
        HashMap<String, Character> mapW = new HashMap<>();

        String[] wordsinS = s.split(" ");

        if(wordsinS.length != pattern.length()) return false;

        for(int i = 0; i < wordsinS.length; i++){

            char cinp = pattern. charAt(i);
            String word = wordsinS[i];

            if(!mapC.containsKey(cinp)){
                if(!mapW.containsKey(word)) {

                    mapC.put(cinp, word);
                    mapW.put(word, cinp);

                }
                else return false;
            }
            else{
                String mapCed_word = mapC.get(cinp);
                if(!mapCed_word.equals(word)) return false;
            }
        }
        return true;
    }

    public static void main(String[] args){

        WordPatten object = new WordPatten();
        String pattern = "abba";
        String s = "dog cat cat dog";

        boolean result = object.wordPattern(pattern, s);
        System.out.println("Word-pattern match is " + result);

    }
}
