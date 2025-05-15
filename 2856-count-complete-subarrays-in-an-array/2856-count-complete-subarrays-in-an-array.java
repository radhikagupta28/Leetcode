class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer>set=new HashSet<>();

        for(int num:nums)
        {
            set.add(num);
        }

        int n=set.size();
        int cnt=0;

        for(int i=0;i<nums.length;i++)
        {
            HashSet<Integer>s=new HashSet<>();
            for(int j=i;j<nums.length;j++)
            {
                s.add(nums[j]);
                if(s.size()==set.size())
                {
                    cnt+=nums.length-j;
                    break;
                }
            }
        }
        return cnt;
    }
}