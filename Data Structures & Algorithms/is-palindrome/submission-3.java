class Solution {
    public boolean isPalindrome(String s) {
        

        if(s.length()==0 || s==null) {
            return true;
        }

        int end=s.length()-1;
        int start=0;
        while(start < end) {

             if(!Character.isLetterOrDigit(s.charAt(start))){
                  start++;
             } else if (!Character.isLetterOrDigit(s.charAt(end))){
                end--;
             } else {

                if(Character.toLowerCase(s.charAt(start))!= Character.toLowerCase(s.charAt(end))) {
                     return false;
                }
                start++;
                end--;
             }
        }
        return true;
    }
}
