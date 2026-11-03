class Solution {
    public int minMoves(int[] nums) {
        int heighest = 0;
        int move = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>heighest){
                heighest = nums[i];
            }
        }
        for(int i=0; i<nums.length; i++){
            move = move + (heighest - nums[i]);
        }
        return move;
    }
}