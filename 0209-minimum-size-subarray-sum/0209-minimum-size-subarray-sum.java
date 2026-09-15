class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int prefix[] = new int[nums.length + 1];

        for(int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        int ans = nums.length + 1;

        for(int i = 0; i < nums.length; i++) {

            int left = i + 1;
            int right = nums.length;

            while(left <= right) {
                int mid = (left + right) / 2;

                int sum = prefix[mid] - prefix[i];

                if(sum >= target) {
                    ans = Math.min(ans, mid - i);
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
        }

        if(ans == nums.length + 1) {
            return 0;
        }

        return ans;
    }
}