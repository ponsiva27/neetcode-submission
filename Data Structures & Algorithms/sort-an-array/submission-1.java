class Solution {
    public int[] sortArray(int[] nums) {
        
        int left=0;
        int right=nums.length-1;
        mergeSort(nums,left,right);
        return nums;
    }

    private void mergeSort(int[] arr , int left, int right) {

        if(left>=right) {
            return;
        }
        int mid = left+(right-left)/2;

        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        merge(arr, left, mid, right);
    }

    private void merge(int[] arr , int left, int mid, int right) {

        int p1=left;
        int p2=mid+1;
        
        ArrayList<Integer> list = new ArrayList<>();
        while(p1<=mid && p2<=right) {
            
            if(arr[p1]<=arr[p2]) {
                 list.add(arr[p1]);
                 p1++;
            } else {
                list.add(arr[p2]);
                p2++;
            }
        }

        while(p1<=mid) {
            list.add(arr[p1]);
            p1++;
        }

        while(p2<=right) {
            list.add(arr[p2]);
            p2++;
        }
        
        
        for(int i=0;i<list.size();i++) {
            arr[i+left] =list.get(i);
        }
    }
}