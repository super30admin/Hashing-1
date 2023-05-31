import java.util.HashMap;

public class Isomorphic {


        public boolean isIsomorphic(String s, String t) {

            if(s.length() != t.length())
            {
                return false;

            }

            HashMap<Character,Character> sMap = new HashMap<>();
            HashMap<Character,Character> tMap = new HashMap<>();
            char[] sChar = new char[50001];
            char[] tChar = new char[50001];
            for(int i=0;i<s.length();i++)
            {
                sChar[i]=s.charAt(i);
                tChar[i]=t.charAt(i);

                if(!sMap.containsKey(sChar[i]))
                {
                    sMap.put(sChar[i],tChar[i]);

                }
                else
                {
                    if(sMap.get(sChar[i])!=tChar[i])
                    {
                        return false;
                    }
                }

                if(!tMap.containsKey(tChar[i]))
                {
                    tMap.put(tChar[i],sChar[i]);

                }
                else
                {
                    if(tMap.get(tChar[i])!=sChar[i])
                    {
                        return false;
                    }
                }


            }

            return true;


        }
    }

