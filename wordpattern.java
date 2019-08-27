//Time Complexity : O(n)
//Passed all the test cases on Leet Code
//Using a single HashMap we have mapped the values pf pattern with String str.
public class wordpattern {

    public static  boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        //iterated over the String str and split in after encountering a blank space.
        //if the length doesn't match for both of them , we will return false
        if(words.length != pattern.length())
            return false;

        HashMap<Character,String> map = new HashMap<>();
        for(int i =0;i<pattern.length();i++){
            char key = pattern.charAt(i);
            String word = words[i];
            //if the map contains the key and value from get key doesn't matches with the word .
            if (map.containsKey(key) && !map.get(key).equals(word))
                return false;
            if(!map.containsKey(key) && (map.containsValue(word)))
                //if the map doest conatins the key but has the value present
                return false;

            map.put(key,word);

        }


        return true;

    }

    public static void main (String[] args) {
        String pattern ="abba";
        String str= "dog cat cat dog";
        System.out.println(wordPattern(pattern,str));
    }
}