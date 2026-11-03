class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++) {
            sum += cardPoints[i];
        }
        int maxsum = sum;
        for(int i = k-1, j = cardPoints.length-1; i>=0; i--, j-- ) {
            sum = sum + cardPoints[j] - cardPoints[i];
            if(sum > maxsum) 
                maxsum = sum;
        }
        return maxsum;

    }
}