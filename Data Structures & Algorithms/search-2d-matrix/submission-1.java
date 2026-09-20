class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row = matrix.length;
        int col = matrix[0].length;

        int left = 0;
        int right = row*col - 1;

        while(left <= right){
    
           int mid = (left + right)/2;

           int midr = mid / col;
           int midc = mid % col;
           
           int curr = matrix[midr][midc];

           if(curr > target){
              right = mid - 1;
           }
           else if (curr < target){
              left = mid + 1;
           }
           else return true;

        }

        return false;

    }
}
