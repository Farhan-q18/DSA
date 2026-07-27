class Solution {
    public int removeDuplicates(int[] nums) {
        int rd = 0; //remove duplicates
        for(int i=1;i<nums.length;i++){
            if(nums[rd] != nums[i]){  // agar rd != nums[i] tb pehle rd++ ko aage kro or fir add kro nums[rd] = num[i]
                rd++;
                nums[rd] = nums[i];
            }
        }
        return rd + 1;   //last pe uska indes+1;krna hota h;
        
    }
}