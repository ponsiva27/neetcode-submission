class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        boolean[] rescued = new boolean[people.length];
        int boats=0;
         for(int i=0;i<people.length;i++){

            if(rescued[i]) continue;
            boats++;
            rescued[i]=true;

            //check who else can fit into the boat with this person
            int findPartner = -1;
            int maxWeightFound = -1;
            for(int j=0;j<people.length;j++){

                if(i!=j && !rescued[j] && (people[i]+people[j]<=limit)){
                     if(people[j]>maxWeightFound){
                        maxWeightFound=people[j];
                        findPartner =j;
                     }
                     
                }
            }
                if(findPartner!=-1){
                    rescued[findPartner] =true;
                }
        }
            return boats;
        
    }
}