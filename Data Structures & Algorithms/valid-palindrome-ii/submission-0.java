class Solution {
    public boolean validPalindrome(String s) {
        
    
        if(isPalindrome(s)){
            return true;
        }

        for(int i=0;i<s.length();i++){
             
             String reduced = s.substring(0,i)+s.substring(i+1);
             if(isPalindrome(reduced)){
                return true;
             }
        }
        return false;
    }
    
        private boolean isPalindrome(String s){

             int start=0;
             int end=s.length()-1;

             while(start<end){

                 if(s.charAt(start)!=s.charAt(end)){
                      return false;
                 }
                 start++;
                 end--;
             }
             return true;
        }
}