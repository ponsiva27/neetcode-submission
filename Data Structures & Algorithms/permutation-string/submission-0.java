class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length()>s2.length()) {
            return false;
        }

        int[] arr = new int[26];

        // Check the first k character if it's a permutation of s2

        for(int i=0; i<s1.length(); i++) {
             arr[s1.charAt(i)-'a']++;
             arr[s2.charAt(i)-'a']--;
        }

        if(checkZero(arr)){
            return true;
        }
        
        int left=0;
        int right=s1.length();

        while(right<s2.length()) {

            arr[s2.charAt(right)-'a']--;   //adding the character from s2
            arr[s2.charAt(left)-'a']++;    //removing the character from s2

            left++;
            right++;
            if(checkZero(arr)){
                return true;
            }
        }
        return false;

    }
    private boolean checkZero(int[] arr){

        for(int num : arr) {
            if(num!=0){
                return false;
            }
        }
        return true;
    }
}
