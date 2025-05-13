class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long tSum=0;

        //total sum
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                tSum+=grid[i][j];
            }
        }

        //if odd sum then can't be divided
        if(tSum%2!=0) return false;

        //horizontal cut
        long rowSum=0;
        for(int i=0;i<grid.length-1;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                rowSum+=grid[i][j];
            }

            if(rowSum*2==tSum) return true;
        }        


        //vertical cut
        //compute column sum
        long[] cols=new long[grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                cols[j]+=grid[i][j];
            }
        }

        long colSum=0;
        for(int i=0;i<grid[0].length-1;i++)
        {
            colSum+=cols[i];
            if(colSum*2==tSum) return true;
        }

        return false;
    }
}