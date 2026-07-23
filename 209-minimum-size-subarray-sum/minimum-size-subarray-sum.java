class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minwindowLen = Integer.MAX_VALUE;
        int currentSum = 0;
        int left = 0;
        int right = 0;

        while(right < nums.length){
            currentSum += nums[right];
            right++;

            while(currentSum>=target){

                int currentwindowSize = right - left;
                minwindowLen = Math.min(minwindowLen,currentwindowSize);

                currentSum -= nums[left];
                left++;
            }
        }
        return minwindowLen == Integer.MAX_VALUE ? 0 : minwindowLen;
        
    }
}