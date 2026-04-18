class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int n=matrix.length;  //row
        int m=matrix[0].length; //col

        if(matrix==null || matrix.length==0 || matrix[0].length==0) {
            return false;
        }

        int left=0;
        int right=(n*m)-1;

        while(left<=right) {

            int mid = left+(right-left)/2;
            int row = mid/m;
            int col=mid%m;

            if(matrix[row][col]==target){
                return true;
            } else if(matrix[row][col]>target){
                right=mid-1;
            } else {
                left=mid+1;
            }

        }
        return false;
    }
}
