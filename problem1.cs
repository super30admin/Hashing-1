public class Solution {
    private int getPrimeProduct(string str)
    {
        int[] primeMapping = [2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103];
        var primeProduct = 1;
        for(var i=0;i<str.Length;i++)
        {
            var primeNumber = primeMapping[str[i]-'a'];
            primeProduct = primeProduct * primeNumber;

        }
        return primeProduct;
    }
    public IList<IList<string>> GroupAnagrams(string[] strs) {
        List<IList<string>> result = new List<IList<string>>();
        if(strs.Length == 0)
        {
            //result.Add(new List(""));
            return result;
        }
        var hashmap = new Dictionary<int,List<string>>();
        foreach(var str in strs)
        {
              var strPrimeProduct = getPrimeProduct(str);
              if(hashmap.ContainsKey(strPrimeProduct))
              {
                hashmap[strPrimeProduct].Add(str);
              }
              else
              {
                var newList = new List<string>();
                newList.Add(str);
                hashmap.Add(strPrimeProduct,newList);
              }
        }
        foreach(var value in hashmap.Values)
        {
            result.Add(value);
        }
        return result;
        
    }
}