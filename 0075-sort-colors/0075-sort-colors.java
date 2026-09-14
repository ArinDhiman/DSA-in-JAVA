class Solution {
    public void sortColors(int[] nums) {
        int right=nums.length-1;
        int left=0;
        for(int i=0;i<=right;i++){
            if(nums[i]==0){
            int temp=nums[i];
            nums[i]=nums[left];
            nums[left]=temp;
            left++;
        }
        else if(nums[i]==2){
            int temp=nums[i];
            nums[i]=nums[right];
            nums[right]=temp;
            right--;
            i--;
        }
        }  
    }
}