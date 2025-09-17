class Solution {
    public void rotate(int[][] matrix) {
        int tmp,i,j;
        int n = matrix.length;
        for(int e = 0;e<n;e++)
        {
            for(int f = e+1;f<n;f++)
            {
                tmp = matrix[e][f];
                matrix[e][f] = matrix[f][e];
                matrix[f][e] = tmp;
            }
        }
        for(int e = 0;e<n;e++)
        {
            i = 0;
            j = n-1;
            while(i<j)
            {
                tmp = matrix[e][i];
                matrix[e][i] = matrix[e][j];
                matrix[e][j] = tmp;
                i++;
                j--;
            }
        }


    }
}