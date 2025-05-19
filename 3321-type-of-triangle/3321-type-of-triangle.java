class Solution {
    public String triangleType(int[] nums) {
        int a=nums[0];
        int b=nums[1];
        int c=nums[2];

        String ans="";

        if(((a+b)>c) && ((b+c)>a) && ((a+c)>b))
        {
            if(a==b && b==c)
            {
                ans= "equilateral";
            }
            else if((a==b) || (b==c) || (a==c))
            {
                ans= "isosceles";
            }
            else
            {
                ans= "scalene";
            }
        }
        else
        {
            ans= "none";
        }
        return ans;
    }
}