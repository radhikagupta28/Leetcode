class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int dp[][] = new int[m][n];

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                dp[i][j]=mat[i][j];
            }
        }


        //top and left check
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]==0)
                {
                    continue;
                }

                int val=m*n;

                if(i>0)
                {
                    val=Math.min(val,dp[i-1][j]);
                }

                if(j>0)
                {
                    val=Math.min(val,dp[i][j-1]);
                }

                dp[i][j]=val+1;
            }
        }



        //bottom and right
        for(int i=m-1;i>=0;i--)
        {
            for(int j=n-1;j>=0;j--)
            {
                if(dp[i][j]==0)
                {
                    continue;
                }

                int val=m*n;
                if(i<m-1)
                {
                    val=Math.min(val,dp[i+1][j]);
                }

                if(j<n-1)
                {
                    val=Math.min(val,dp[i][j+1]);
                }

                dp[i][j]=Math.min(dp[i][j],val+1);
            }
        }

        return dp;
        
    }
}