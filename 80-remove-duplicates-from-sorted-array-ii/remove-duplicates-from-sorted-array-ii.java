class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 2)return nums.length;
        int rd = 2;
        for(int i=2;i<nums.length;i++){
            if(nums[i] != nums[rd-2]){
            nums[rd] = nums[i];
            rd++;
        }
        }return rd;
    }
}