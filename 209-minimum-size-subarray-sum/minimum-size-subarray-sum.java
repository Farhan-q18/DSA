class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int minlen = Integer.MAX_VALUE;
        int currentSum = 0;

        int low = 0;
        int high = 0;
        while(high < nums.length){
            currentSum += nums[high];
            high++;

            while(currentSum >= target){
            
                int windowSize = high - low;
                minlen = Math.min(minlen,windowSize);

                currentSum -= nums[low];
                low++;
            }
        }
        return minlen == Integer.MAX_VALUE ? 0 : minlen;

    }
}