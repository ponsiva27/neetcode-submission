class Solution {
    public boolean isPalindrome(String s) {
        
        if(s==null || s.length()==0){
            return true;
        }

        int start=0;
        int end=s.length()-1;

        while(start<=end){
            char leftChar = s.charAt(start);
            char rightChar = s.charAt(end);

             if(!Character.isLetterOrDigit(leftChar)){
                start++;
             } else if (!Character.isLetterOrDigit(rightChar)) {
                 end--;
             } else if (Character.toLowerCase(leftChar)!=Character.toLowerCase(rightChar)){
                  return false;
             } else {
                start++;
                end--;
             }
        }
        return true;
    }
}
