class Solution {
    public int sumOfSquares(int[] nums) {
        int squares = 0;
        int n = nums.length;
        for(int i = 0; i<nums.length; i++) {
            if(n%(i+1) == 0) {
                int s = nums[i];
                squares += (s*s);
            }
        }
        return squares;
    }
}