class Solution {
    public int characterReplacement(String s, int k) {
        
        int[] freqArray = new int[26];
        int maxFreq =0;
        int left=0;
        int maxLen=0;
        for(int i=0;i<s.length();i++) {

            freqArray[s.charAt(i)-'A']++;

            maxFreq = Math.max(maxFreq, freqArray[s.charAt(i)-'A']);

            while( (i-left+1) - maxFreq >k) {
                 freqArray[s.charAt(left)-'A']--;
                 left++;
            }
          maxLen = Math.max(maxLen,i-left+1);
        }
        return maxLen;
    }
}
