class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = 0;
        int h = nums.length - 1;
        int[] res = {-1,-1};

        while(l<=h){
            int mid = l+(h-l)/2;
            if(nums[mid] == target){
                res[0] = mid;
                h = mid - 1;
            }else if(nums[mid] < target){
                l = mid + 1;
            }else{
                h = mid - 1;
            }
            
        }
        l = 0;
        h = nums.length - 1;
        int mid = 0;

        while(l<=h){
            mid = l + (h - l)/2;
            if(nums[mid] == target){
                res[1] = mid;
                l = mid + 1;
            }else if(nums[mid] < target){
                l = mid + 1;
            }else{
                h = mid - 1;
            }

        }
        return res;
        
    }
}