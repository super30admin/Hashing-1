{\rtf1\ansi\ansicpg1252\cocoartf2636
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red15\green112\blue1;\red255\green255\blue255;\red0\green0\blue0;
\red0\green0\blue255;\red32\green108\blue135;\red101\green76\blue29;\red0\green0\blue109;\red157\green0\blue210;
\red144\green1\blue18;\red19\green118\blue70;}
{\*\expandedcolortbl;;\cssrgb\c0\c50196\c0;\cssrgb\c100000\c100000\c100000;\cssrgb\c0\c0\c0;
\cssrgb\c0\c0\c100000;\cssrgb\c14902\c49804\c60000;\cssrgb\c47451\c36863\c14902;\cssrgb\c0\c6275\c50196;\cssrgb\c68627\c0\c85882;
\cssrgb\c63922\c8235\c8235;\cssrgb\c3529\c52549\c34510;}
\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs26 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 //Time complexity is O(N), N is pattern length\cf0 \cb1 \strokec4 \
\cf2 \cb3 \strokec2 //Space complexity is O(N)\cf0 \cb1 \strokec4 \
\cf2 \cb3 \strokec2 //Able to submit the code in leetcode\cf0 \cb1 \strokec4 \
\
\pard\pardeftab720\partightenfactor0
\cf5 \cb3 \strokec5 class\cf0 \strokec4  \cf6 \strokec6 Solution\cf0 \strokec4  \{\cb1 \
\pard\pardeftab720\partightenfactor0
\cf0 \cb3     \cf5 \strokec5 public\cf0 \strokec4  \cf6 \strokec6 boolean\cf0 \strokec4  \cf7 \strokec7 wordPattern\cf0 \strokec4 (\cf6 \strokec6 String\cf0 \strokec4  \cf8 \strokec8 pattern\cf0 \strokec4 , \cf6 \strokec6 String\cf0 \strokec4  \cf8 \strokec8 s\cf0 \strokec4 ) \{\cb1 \
\cb3         \cf6 \strokec6 Map\cf0 \strokec4 <\cf6 \strokec6 Character\cf0 \strokec4 , \cf6 \strokec6 String\cf0 \strokec4 > \cf8 \strokec8 map1\cf0 \strokec4  = \cf9 \strokec9 new\cf0 \strokec4  \cf6 \strokec6 HashMap\cf0 \strokec4 <\cf6 \strokec6 Character\cf0 \strokec4 , \cf6 \strokec6 String\cf0 \strokec4 >();\cb1 \
\cb3         \cf6 \strokec6 Map\cf0 \strokec4 <\cf6 \strokec6 String\cf0 \strokec4 , \cf6 \strokec6 Character\cf0 \strokec4 > \cf8 \strokec8 map2\cf0 \strokec4  = \cf9 \strokec9 new\cf0 \strokec4  \cf6 \strokec6 HashMap\cf0 \strokec4 <\cf6 \strokec6 String\cf0 \strokec4 , \cf6 \strokec6 Character\cf0 \strokec4 >();\cb1 \
\cb3         \cf6 \strokec6 String\cf0 \strokec4 [] \cf8 \strokec8 strArr\cf0 \strokec4  = \cf8 \strokec8 s\cf0 \strokec4 .\cf7 \strokec7 split\cf0 \strokec4 (\cf10 \cb3 \strokec10 " "\cf0 \cb3 \strokec4 );\cb1 \
\cb3         \cf2 \strokec2 //If pattern length and number of words in given s are not equal, return false as it directly indicating that notfollowing pattern\cf0 \cb1 \strokec4 \
\cb3         \cf9 \strokec9 if\cf0 \strokec4 (\cf8 \strokec8 strArr\cf0 \strokec4 .\cf8 \strokec8 length\cf0 \strokec4 !=\cf8 \strokec8 pattern\cf0 \strokec4 .\cf7 \strokec7 length\cf0 \strokec4 ())\cb1 \
\cb3         \{\cb1 \
\cb3             \cf9 \strokec9 return\cf0 \strokec4  \cf5 \strokec5 false\cf0 \strokec4 ;\cb1 \
\cb3         \}\cb1 \
\cb3         \cf9 \strokec9 for\cf0 \strokec4 (\cf6 \strokec6 int\cf0 \strokec4  \cf8 \strokec8 i\cf0 \strokec4 =\cf11 \strokec11 0\cf0 \strokec4 ;i<\cf8 \strokec8 pattern\cf0 \strokec4 .\cf7 \strokec7 length\cf0 \strokec4 ();i++)\{\cb1 \
\cb3             \cf9 \strokec9 if\cf0 \strokec4 (\cf8 \strokec8 map1\cf0 \strokec4 .\cf7 \strokec7 containsKey\cf0 \strokec4 (\cf8 \strokec8 pattern\cf0 \strokec4 .\cf7 \strokec7 charAt\cf0 \strokec4 (i)))\{\cb1 \
\cb3                 \cf8 \strokec8 System\cf0 \strokec4 .\cf8 \strokec8 out\cf0 \strokec4 .\cf7 \strokec7 println\cf0 \strokec4 (\cf8 \strokec8 map1\cf0 \strokec4 .\cf7 \strokec7 get\cf0 \strokec4 (\cf8 \strokec8 pattern\cf0 \strokec4 .\cf7 \strokec7 charAt\cf0 \strokec4 (i)));\cb1 \
\cb3                 \cf8 \strokec8 System\cf0 \strokec4 .\cf8 \strokec8 out\cf0 \strokec4 .\cf7 \strokec7 println\cf0 \strokec4 (strArr[i]);\cb1 \
\cb3                 \cf9 \strokec9 if\cf0 \strokec4 (!\cf8 \strokec8 map1\cf0 \strokec4 .\cf7 \strokec7 get\cf0 \strokec4 (\cf8 \strokec8 pattern\cf0 \strokec4 .\cf7 \strokec7 charAt\cf0 \strokec4 (i)).\cf7 \strokec7 equals\cf0 \strokec4 (strArr[i]))\{\cb1 \
\cb3                     \cf9 \strokec9 return\cf0 \strokec4  \cf5 \strokec5 false\cf0 \strokec4 ;\cb1 \
\cb3                 \}\cb1 \
\cb3             \}\cb1 \
\cb3             \cf9 \strokec9 else\cf0 \strokec4 \{\cb1 \
\cb3                 \cf8 \strokec8 map1\cf0 \strokec4 .\cf7 \strokec7 put\cf0 \strokec4 (\cf8 \strokec8 pattern\cf0 \strokec4 .\cf7 \strokec7 charAt\cf0 \strokec4 (i), strArr[i]);\cb1 \
\cb3             \}\cb1 \
\cb3             \cf9 \strokec9 if\cf0 \strokec4 (\cf8 \strokec8 map2\cf0 \strokec4 .\cf7 \strokec7 containsKey\cf0 \strokec4 (strArr[i]))\{\cb1 \
\cb3                 \cf8 \strokec8 System\cf0 \strokec4 .\cf8 \strokec8 out\cf0 \strokec4 .\cf7 \strokec7 println\cf0 \strokec4 (\cf8 \strokec8 map2\cf0 \strokec4 .\cf7 \strokec7 get\cf0 \strokec4 (strArr[i]));\cb1 \
\cb3                 \cf8 \strokec8 System\cf0 \strokec4 .\cf8 \strokec8 out\cf0 \strokec4 .\cf7 \strokec7 println\cf0 \strokec4 (\cf8 \strokec8 pattern\cf0 \strokec4 .\cf7 \strokec7 charAt\cf0 \strokec4 (i));\cb1 \
\cb3                 \cf9 \strokec9 if\cf0 \strokec4 (!\cf8 \strokec8 map2\cf0 \strokec4 .\cf7 \strokec7 get\cf0 \strokec4 (strArr[i]).\cf7 \strokec7 equals\cf0 \strokec4 (\cf8 \strokec8 pattern\cf0 \strokec4 .\cf7 \strokec7 charAt\cf0 \strokec4 (i)))\{\cb1 \
\cb3                     \cf9 \strokec9 return\cf0 \strokec4  \cf5 \strokec5 false\cf0 \strokec4 ;\cb1 \
\cb3                 \}\cb1 \
\cb3             \}\cb1 \
\cb3             \cf9 \strokec9 else\cf0 \cb1 \strokec4 \
\cb3             \{\cb1 \
\cb3                 \cf8 \strokec8 map2\cf0 \strokec4 .\cf7 \strokec7 put\cf0 \strokec4 (strArr[i], \cf8 \strokec8 pattern\cf0 \strokec4 .\cf7 \strokec7 charAt\cf0 \strokec4 (i));\cb1 \
\cb3             \}\cb1 \
\cb3         \}\cb1 \
\cb3         \cf9 \strokec9 return\cf0 \strokec4  \cf5 \strokec5 true\cf0 \strokec4 ;\cb1 \
\cb3     \}\cb1 \
\cb3 \}\cb1 \
}