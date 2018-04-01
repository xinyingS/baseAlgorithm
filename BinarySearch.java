public class Solution {

        public int lastPosition(int[] nums, int target) {
     
        if(nums == null || nums.length == 0){
            return -1;
        }
        
        int start = 0;
        int end = nums.length - 1;

        while(start + 1 < end){
            int mid = start + (end - start) / 2;  // 234567 ~ 3456790

            if(nums[mid] == target){
                start = mid;
            }
            else if(nums[mid] < target){ // else if and if 不兼容
                start = mid;
            }
            else{
                end = mid;
            }
        }
        
        if(nums[end] == target){ //找最后一个end放前面，找第一个start 放前面
            return end;
        }
        
        if(nums[start] == target){
            return start;
        }
        
        return -1;
    }

}