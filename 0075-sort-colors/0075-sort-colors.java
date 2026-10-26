class Solution {
    public void sortColors(int[] nums) {
        // for(int i = 0; i<nums.length-1; i++) {
        //     for(int j = i+1; j<nums.length; j++) {
        //         if(nums[i] > nums[j]) {
        //             int temp = nums[i];
        //             nums[i] = nums[j];
        //             nums[j] = temp;
        //         }
        //     }
        // }

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while(mid<=high) {
            if(nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++; 
            }
            else if(nums[mid] == 1) {
                mid++;
            } 
            else {
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }
    }
}