class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int end = matrix.length-1;
        int s,e;
        s = 0;
        e = matrix[0].length-1;
        int mid;
        while(start<end)
        {
            mid = start+(end-start)/2;
            if(target<matrix[mid][0]) end = mid-1;
            else if(target>matrix[mid][e]) start = mid+1;
            else 
            {
                end = mid;
                start = mid;
            }
        }
        while(s<=e)
        {
            mid = s+(e-s)/2;
            if(matrix[start][mid] == target) return true;
            else if(matrix[start][mid]<target) s = mid+1;
            else e = mid-1;
        }
        return false;
    }
}