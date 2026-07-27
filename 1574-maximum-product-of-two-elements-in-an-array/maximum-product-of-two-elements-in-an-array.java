class Solution {
    public int maxProduct(int[] nums) {    
        int Largest = 0;
        int secondLargest = 0;

        for(int num : nums){
            if(num>Largest){
                secondLargest = Largest;
                Largest = num;
            }else if(num>secondLargest){
                secondLargest = num;
            }
        }  
        return (Largest-1) * (secondLargest-1);
    }
}
// next method would be 
// Arrays.sort(nums);
// int n = nums.length;
// return (nums[n-1]-1)*(nums[n-2]-1);
// but it will take o(nlogn) time cpmplexcity which is not optimal