class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++)
        {
            String n=Integer.toString(i);
            int len=n.length();
            if(len%2!=0) continue;

            int mid=len/2;
            int sum=0;
            for(int j=0;j<mid;j++)
            {
                sum+=n.charAt(j)-'0';
            }
            int sum2=0;
            for(int j=mid;j<n.length();j++)
            {
                sum2+=n.charAt(j)-'0';
            }

            if(sum==sum2){
                count++;
            }
        }
        return count;
    }
}