class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
        stlist=str.split()  #splitting the string into separate words
      #creating two dictionaries
        dict1={}
        dict2={}
        
        #if the length of the pattern and string list after splitting is not equal, then we outright give false
        
        if len(stlist)!=len(pattern):
            return False
        
        #iterating through each character 
        for i in range(len(pattern)):
            
            #checking is the char with the value already exists in the hashmap
            if pattern[i] in dict1.keys():
                
                #if it exists checking if the value of the key is of stlist[i] for it to be isomorphic else return False
                if(dict1.get(pattern[i]))!=stlist[i]:
                    return False
            else:
                  #if not insert it in hashmap
                dict1[pattern[i]]=stlist[i]
                ########################
                
         #iterating through each character 
        for i in range(len(pattern)):
            
             
            #checking is the char with the value already exists in the hashma
            if stlist[i] in dict2.keys():
                
                #if it exists checking if the value of the key is of pattern[i] for it to be isomorphic else return False
                if(dict2.get(stlist[i]))!=pattern[i]):
                    return False
            else:
                #if not insert it in hashmap
                dict2[stlist[i]]=pattern[i]
                ##########################
    # AFTER ITERATING THROUGH OUT ALL THE CHARS IN THE WORD, IT MEANS THERE ARE NO FALSE AND ITS ISOMORPHIC
        return True