import java.util.*;

class Patterns{
  private boolean findPatterns(String pattern, String str){
    HashMap<Character,String> map = new HashMap<>();
    String[] indivialWords = str.split(" ");
    if(indivialWords.length != pattern.length())
      return false;
    else{
      for(int i=0;i<pattern.length();i++){
        if(map.containsKey(pattern.charAt(i))) {
          if (!map.get(pattern.charAt(i)).equals(indivialWords[i]))
            return false;
        }
        else {
          if(map.containsValue(indivialWords[i]))
            return false;
          map.put(pattern.charAt(i), indivialWords[i]);
        }
      }
      return true;
    }
  }
  public static void main(String[] args) {
    Patterns p = new Patterns();
    String pattern = "abba";
    String str = "dog cat cat dog";
    boolean result = p.findPatterns(pattern,str);
    System.out.println(result);
  }
}