class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs==null || strs.length==0) {
            return  " ";
        }
        Arrays.sort(strs);
        String p1 = strs[0];
        String p2= strs[strs.length-1];


        StringBuilder str = new StringBuilder();
        int i=0;
        while(i< p1.length() && i < p2.length()) {
            
            if(p1.charAt(i)!=p2.charAt(i)){
                   break;
            } else {
                str.append(p1.charAt(i));
            } 
            i++;
        }

        return str.toString();
    }
}