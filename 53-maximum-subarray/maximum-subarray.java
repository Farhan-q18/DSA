class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];   //first we assigned both as nums[0] means 1st element.
        int maxSum = nums[0];
        for(int i=1; i<nums.length; i++){
            if(sum >= 0){
                sum += nums[i];
            }
            else{
                sum = nums[i];
            }
            if(sum > maxSum){
                maxSum = sum;
            }
        }return maxSum;
        
    }
}