class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s2.length() < s1.length()) {
            return false;
        }

        int[] permute = new int[26];

        for(int i=0;i<s1.length();i++) {
             permute[s1.charAt(i)-'a']++;
             permute[s2.charAt(i)-'a']--;
        }

        if(checkZero(permute)) {
            return true;
        }

        for(int i=s1.length();i<s2.length();i++) {

            permute[s2.charAt(i-s1.length())-'a']++;
            
            permute[s2.charAt(i)-'a']--;

            if(checkZero(permute)) {
                return true;
            }
        }

        return false;
    }

    private boolean checkZero(int[] permute) {

        for(int num : permute) {
            if(num!=0) {
                return false;
            }
        }

        return true;
    } 
}
