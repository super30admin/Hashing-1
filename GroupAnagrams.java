import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
        public List<List<String>> groupAnagrams(String[] strs) {
      List<List<String>> resList = new ArrayList<>();
        List<String> strlist = new ArrayList<>();
    for(int j=0;j<strs.length;j++)
    { 
        char ch;
        char[] chr = strs[j].toCharArray();
      for(int i=0;i<chr.length;i++)
       {
          for(int k=i;k<chr.length;k++){
          if(chr[i]>chr[k])
          {
             ch = chr[i];
              chr[i] = chr[k];
              chr[k] =ch; 
          }
          }
           
      }
        
        strlist.add(String.valueOf(chr));
        
    }
        Map<String,List<String>> mpr = new HashMap<String,List<String>>();
        for(int i=0;i<strlist.size();i++){
            if(mpr.containsKey(strlist.get(i)))
            {
                mpr.get(strlist.get(i)).add(strs[i]);
            }
            else
            {   List<String> a = new ArrayList<String>();
                a.add(strs[i]);
                mpr.put(strlist.get(i),a);
            }
        }
        for(String str:mpr.keySet()){
           
            resList.add(mpr.get(str));
        }
        
       return resList; 
    }
}
