class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] squares = new long[n];
        for(int i = 0; i<n; i++) {
            long val = nums[i];
            squares[i] = val * val;
        }
        Arrays.sort(squares);
        long score = 0;
        int negCnt = n/2;
        for(int i = 0; i<n; i++) {
            if(i<negCnt) {
                score -= squares[i];
            }
            else {
                score += squares[i];
            }
        }
        return score;
    }
}