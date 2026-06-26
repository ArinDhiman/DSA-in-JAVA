class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int freq=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                freq++;
                if(freq > nums.length/2){
                    return nums[i];
                }
            }
            else{
                freq=1;
            }
        }
        return nums[0];
    }
}