class Solution {
    public int[][] generateMatrix(int n) {
        
        int matrix[][]=new int[n][n];

        int topRow=0,bottomRow=n-1,leftCol=0,rightCol=n-1,cnt=1;

        while(cnt<=n*n)
        {
            //topRow->leftCol-rightCol
            for(int i=leftCol;i<=rightCol && cnt<=n*n;i++)
            {
                matrix[topRow][i]=cnt++;
            }
            topRow++;

            //rightCol->topRow-bottomRow
            for(int i=topRow;i<=bottomRow && cnt<=n*n;i++)
            {
                matrix[i][rightCol]=cnt++;
            }
            rightCol--;

            //bottomRow->rightCol-leftCOl
            for(int i=rightCol;i>=leftCol && cnt<=n*n;i--)
            {
                matrix[bottomRow][i]=cnt++;
            }
            bottomRow--;

            //leftCol->bottomRow-topRow
            {
                for(int i=bottomRow;i>=topRow && cnt<=n*n;i--)
                {
                    matrix[i][leftCol]=cnt++;
                }
            }
            leftCol++;
        }
        return matrix;
    }
}