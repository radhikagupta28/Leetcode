class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int dp[][] = new int[n][m];

        for(int i=0;i<m;i++){
            dp[0][i]=matrix[0][i];
        }

        for(int i=1;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int up=dp[i-1][j]+matrix[i][j];
                int rd=(j<m-1)?dp[i-1][j+1]+matrix[i][j]:Integer.MAX_VALUE;
                int ld=(j>0)?dp[i-1][j-1]+matrix[i][j]:Integer.MAX_VALUE;

                dp[i][j]=Math.min(up,Math.min(ld,rd));
            }
        }

        int ans=Integer.MAX_VALUE;

        for(int j=0;j<n;j++)
        {
            ans=Math.min(ans,dp[n-1][j]);
        }

        return ans;
    }
}