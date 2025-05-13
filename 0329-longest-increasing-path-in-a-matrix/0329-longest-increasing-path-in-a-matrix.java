class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] memo = new int[m][n];

        int maxi=0;

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                maxi=Math.max(maxi,lpi(matrix,i,j,memo));
            }
        }

        return maxi;
    }

    public int lpi(int[][] matrix , int i, int j, int[][] memo)
    {
        int m=matrix.length;
        int n=matrix[0].length;
        if(i<0 || j<0 || j>=n || i>=m)
        {
            return 0;
        }

        if(memo[i][j]>0)
        {
            return memo[i][j];
        }

        int currMax=1;
        //right neighbour

        if(i+1>=0 && i+1<m && matrix[i+1][j]>matrix[i][j])
        {
            currMax=Math.max(currMax,1+lpi(matrix,i+1,j,memo));
        }


        //downwards neighbour

        if(j+1>=0 && j+1<n && matrix[i][j+1]>matrix[i][j])
        {
            currMax=Math.max(currMax,1+lpi(matrix,i,j+1,memo));
        }


        //left neighbour

        if(i-1>=0 && i-1<m && matrix[i-1][j]> matrix[i][j])
        {
            currMax=Math.max(currMax,1+lpi(matrix,i-1,j,memo));
        }

        //upwards neighbour

        if(j-1>=0 && j-1<n && matrix[i][j-1]>matrix[i][j])
        {
            currMax=Math.max(currMax,1+lpi(matrix,i,j-1,memo));
        }

        memo[i][j]=currMax;

        return currMax;

    }
}