class Solution {
    public void setZeroes(int[][] matrix) {
        int m,n;
        m = matrix.length;
        n = matrix[0].length;
        int []row = new int[m];
        int []col = new int[n];
        for(int e = 0;e<m;e++)
        {
            for(int f = 0;f<n;f++)
        {
            if(matrix[e][f] == 0)
            {
               row[e] = 1;
               col[f] = 1;
            }
        }         
        }
        for(int i = 0;i<m;i++)
        {
            if(row[i] == 1) for(int a = 0;a<n;a++) matrix[i][a] = 0;
        }
         
         for(int i = 0;i<n;i++)
        {
            if(col[i] == 1) for(int a = 0;a<m;a++) matrix[a][i] = 0;
        }
    }
}


            