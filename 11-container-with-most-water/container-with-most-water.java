import java.util.*;
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxa = 0;

        while(left<right){
            int width = right - left;
            int curr = Math.min(height[left],height[right]);
            int area = curr * width;
            maxa = Math.max(maxa,area);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxa;
    }
}