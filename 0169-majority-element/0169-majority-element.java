class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer>maj = new HashMap<>();
        int threshold = nums.length/2;
        for(int num: nums) {
            maj.put(num, maj.getOrDefault(num,0)+1);
            if(maj.get(num) > threshold) {
            return num;
        }
    }
        return -1;
    }
}