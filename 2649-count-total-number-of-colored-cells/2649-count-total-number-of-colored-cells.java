class Solution {
    public long coloredCells(int n) {
        long ans=1;
        if(n==1)
        {
            return 1;
        }
        for(int i=1;i<n;i++)
        {
            ans+=i*4;
        }        
        return ans;
    }
}