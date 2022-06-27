class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strArray=s.split(" ");
        if(pattern.length()!=strArray.length)
            return false;
        HashMap< Character,String > pmap = new HashMap();
        HashMap< String,Character > smap = new HashMap();
        for(int i=0;i<pattern.length();i++)
        {
            char pchar=pattern.charAt(i);
            String str=strArray[i];
            if(pmap.containsKey(pchar))
            {
                if(!str.equals(pmap.get(pchar)))
                {
                    return false;
                }
            }
            else
            {
                pmap.put(pchar,str);
            }
            if(smap.containsKey(str))
            {
                if(smap.get(str)!=pchar)
                {
                    return false;
                }
            }
            else
            {
                smap.put(str,pchar);
            }

        }
        return true;

    }
}