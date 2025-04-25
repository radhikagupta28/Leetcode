class Solution {
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public void reverse(int[] nums){
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {
        int pivot=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot=i;
                break;
            }
        }

        if(pivot==-1){
            reverse(nums);
            return;
        }

        for(int i=nums.length-1;i>pivot;i--){
            if(nums[i]>nums[pivot]){
                swap(nums,i,pivot);
                break;
            }
        }
        int i=pivot+1;
        int j=nums.length-1;
        while(i<=j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}