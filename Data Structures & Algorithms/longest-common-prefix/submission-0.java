class Solution {
    public String longestCommonPrefix(String[] strs) {
        

         String firstWord = strs[0];

         for(int i=0;i<firstWord.length();i++){

                for(int j=1;j<strs.length;j++){

                      if(i==strs[j].length() || firstWord.charAt(i)!=strs[j].charAt(i)){
                           return firstWord.substring(0,i);
                      }            
                }               
         }
         return  firstWord;
    }
}