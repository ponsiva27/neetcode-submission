class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        int currentSum=0;
        int avg=0;
        int size=0;

        for(int i=0;i<k;i++) {
            currentSum=currentSum+arr[i];
        }

        avg=currentSum/k;

        if(avg>=threshold) {
            size++;
        }

        for(int i=k;i<arr.length;i++) {
            avg=0;
            currentSum = currentSum-arr[i-k]+arr[i];
            avg=currentSum/k;
            if(avg>=threshold){
                size++;
            }
        }
        return size;

    }
}