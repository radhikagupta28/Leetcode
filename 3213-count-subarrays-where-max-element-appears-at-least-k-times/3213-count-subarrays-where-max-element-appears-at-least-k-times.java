class Solution {
    public long countSubarrays(int[] nums, int k) {
        int l=0;
        long ans=0;
        long cnt=0;

        long maxi=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            maxi=Math.max(maxi,nums[i]);
        }


        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==maxi)
            {
                cnt++;
            }

            while(cnt>=k)
            {
                if(nums[l]==maxi)
                {
                    cnt--;
                }
                l++;
            }

            ans+=l;
        }
        return ans;
    }
}