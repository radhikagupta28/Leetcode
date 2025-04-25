class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int leftMax=height[0];
        int rightMax=height[height.length-1];
        int water=0;

        while(left<right){
            if(leftMax<rightMax){
                left++;
                leftMax=Math.max(height[left],leftMax);
                water+=leftMax-height[left];
            }
            else
            {
                right--;
                rightMax=Math.max(height[right],rightMax);
                water+=rightMax-height[right];
            }
        }
        return water;
    }
}