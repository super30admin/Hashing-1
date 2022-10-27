{\rtf1\ansi\ansicpg1252\cocoartf2636
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 .AppleSystemUIFontMonospaced-Regular;\f1\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red12\green99\blue153;\red0\green0\blue0;\red210\green50\blue85;
\red135\green135\blue135;\red135\green91\blue44;\red255\green255\blue255;}
{\*\expandedcolortbl;;\cssrgb\c0\c46667\c66667;\cssrgb\c0\c0\c0;\cssrgb\c86667\c29020\c40784;
\cssrgb\c60000\c60000\c60000;\cssrgb\c60392\c43137\c22745;\cssrgb\c100000\c100000\c100000\c50196;}
\margl1440\margr1440\vieww28600\viewh18000\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs26 \cf2 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 //Time complexity is O(m*n*logn) where m is length of given array, n is maximum length of string in given array.\
//Space complexity is O(m*n)\
//Able to submit the code in leetcode\
class\cf0 \strokec3  \cf4 \strokec4 Solution\cf0 \strokec3  \cf5 \strokec5 \{\cf0 \strokec3 \
    \cf4 \strokec4 HashMap\cf5 \strokec5 <\cf4 \strokec4 String\cf5 \strokec5 ,\cf0 \strokec3  \cf4 \strokec4 List\cf5 \strokec5 <\cf4 \strokec4 String\cf5 \strokec5 >>\cf0 \strokec3  hm \cf6 \cb7 \strokec6 =\cf0 \cb1 \strokec3  \cf2 \strokec2 new\cf0 \strokec3  \cf4 \strokec4 HashMap\cf5 \strokec5 <>();\cf0 \strokec3 \
    \cf2 \strokec2 public\cf0 \strokec3  \cf4 \strokec4 List\cf5 \strokec5 <\cf4 \strokec4 List\cf5 \strokec5 <\cf4 \strokec4 String\cf5 \strokec5 >>\cf0 \strokec3  \cf4 \strokec4 groupAnagrams\cf5 \strokec5 (\cf4 \strokec4 String\cf5 \strokec5 []\cf0 \strokec3  strs\cf5 \strokec5 )\cf0 \strokec3  \cf5 \strokec5 \{\cf0 \strokec3 \
        \cf4 \strokec4 List\cf5 \strokec5 <\cf4 \strokec4 List\cf5 \strokec5 <\cf4 \strokec4 String\cf5 \strokec5 >>\cf0 \strokec3  result\cf6 \cb7 \strokec6 =\cf0 \cb1 \strokec3  \cf2 \strokec2 new\cf0 \strokec3  \cf4 \strokec4 ArrayList\cf5 \strokec5 ();\cf0 \strokec3 \
        \cf2 \strokec2 for\cf5 \strokec5 (\cf4 \strokec4 String\cf0 \strokec3  str\cf6 \cb7 \strokec6 :\cf0 \cb1 \strokec3  strs\cf5 \strokec5 )\{\cf0 \strokec3 \
            \cf2 \strokec2 char\cf5 \strokec5 []\cf0 \strokec3  charArr \cf6 \cb7 \strokec6 =\cf0 \cb1 \strokec3  str\cf5 \strokec5 .\cf4 \strokec4 toCharArray\cf5 \strokec5 ();\cf0 \strokec3 \
            \cf4 \strokec4 Arrays\cf5 \strokec5 .\cf4 \strokec4 sort\cf5 \strokec5 (\cf0 \strokec3 charArr\cf5 \strokec5 );\cf0 \strokec3 \
            \cf4 \strokec4 String\cf0 \strokec3  temp \cf6 \cb7 \strokec6 =\cf0 \cb1 \strokec3  \cf2 \strokec2 new\cf0 \strokec3  \cf4 \strokec4 String\cf5 \strokec5 (\cf0 \strokec3 charArr\cf5 \strokec5 );\cf0 \strokec3 \
            \cf4 \strokec4 List\cf5 \strokec5 <\cf4 \strokec4 String\cf5 \strokec5 >\cf0 \strokec3  li \cf6 \cb7 \strokec6 =\cf0 \cb1 \strokec3  hm\cf5 \strokec5 .\cf4 \strokec4 getOrDefault\cf5 \strokec5 (\cf0 \strokec3 temp\cf5 \strokec5 ,\cf0 \strokec3  \cf2 \strokec2 new\cf0 \strokec3  \cf4 \strokec4 ArrayList\cf5 \strokec5 ());\cf0 \strokec3 \
            li\cf5 \strokec5 .\cf4 \strokec4 add\cf5 \strokec5 (\cf0 \strokec3 str\cf5 \strokec5 );\cf0 \strokec3 \
            hm\cf5 \strokec5 .\cf4 \strokec4 put\cf5 \strokec5 (\cf0 \strokec3 temp\cf5 \strokec5 ,\cf0 \strokec3  li\cf5 \strokec5 );\cf0 \strokec3 \
        \cf5 \strokec5 \}\cf0 \strokec3 \
        \cf2 \strokec2 for\cf5 \strokec5 (\cf4 \strokec4 String\cf0 \strokec3  str\cf6 \cb7 \strokec6 :\cf0 \cb1 \strokec3  hm\cf5 \strokec5 .\cf4 \strokec4 keySet\cf5 \strokec5 ())\{\cf0 \strokec3 \
            result\cf5 \strokec5 .\cf4 \strokec4 add\cf5 \strokec5 (\cf0 \strokec3 hm\cf5 \strokec5 .\cf4 \strokec4 get\cf5 \strokec5 (\cf0 \strokec3 str\cf5 \strokec5 ));\cf0 \strokec3 \
        \cf5 \strokec5 \}\cf0 \strokec3 \
        \cf2 \strokec2 return\cf0 \strokec3  result\cf5 \strokec5 ;\cf0 \strokec3 \
    \cf5 \strokec5 \}\cf0 \strokec3 \
\pard\pardeftab720\partightenfactor0
\cf5 \strokec5 \}
\f1 \cf0 \strokec3 \
}