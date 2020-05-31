import java.util.*;

class Isomorphic{

  public boolean findIsomorphic(String first, String second){
    if(first.length() != second.length())
      return false;
    else{
      HashMap<Character,Character> map1 = new HashMap<>();

      for(int i =0;i<first.length();i++){
        char letterOfFirst = first.charAt(i);
        char letterOfSecond = second.charAt(i);

        if(map1.containsKey(letterOfFirst)){
          if(letterOfSecond > map1.get(letterOfFirst) || letterOfSecond < map1.get(letterOfFirst))
            return false;
        }
        else
          map1.put(letterOfFirst,letterOfSecond);

      }
      return true;
    }
  }
  public static void main(String[] args) {
    Isomorphic i = new Isomorphic();
    boolean result = i.findIsomorphic("foo","bar");
    System.out.println(result);
  }
}