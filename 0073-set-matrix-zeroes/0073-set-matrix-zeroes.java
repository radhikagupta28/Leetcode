class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;

        boolean r=false;
        boolean col=false;

        //check first row
        for(int i=0;i<n;i++)
        {
            if(matrix[0][i]==0)
            {
                r=true;
                break;
            }
        }

        //check first col
        for(int j=0;j<m;j++)
        {
            if(matrix[j][0]==0)
            {
                col=true;
                break;
            }
        }

        //mark in first row and col
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
         //handle othhers
        for(int i=1;i<m;i++)
        {
           for(int j=1;j<n;j++)
           {
               if(matrix[i][0]==0 || matrix[0][j]==0)
               {
                    matrix[i][j]=0;
               }
           }
        }


        //handle first row nd col if true
        if(r==true)
        {
            for(int j=0;j<n;j++)
            {
                matrix[0][j]=0;
            }
        }

        if(col==true)
        {
            for(int j=0;j<m;j++)
            {
                matrix[j][0]=0;
            }
        }

    }
}