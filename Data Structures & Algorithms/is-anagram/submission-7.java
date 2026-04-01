class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
           map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        
        for(char ch : t.toCharArray()){

             if(!map.containsKey(ch)){
                return false;
             }
             int freq =map.get(ch);
             if(freq==1){
                map.remove(ch);
             } else {
                map.put(ch, map.get(ch)-1);
             }
        }
        return map.size()==0? true:false;
    }
}
