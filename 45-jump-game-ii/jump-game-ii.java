class Solution {
    public int jump(int[] nums) {
        int far=0,curr=0,jump=0;
        for(int i=0;i<nums.length-1;i++){
            far=Math.max(far,i+nums[i]);
            if(curr==i){
                jump++;
                curr=far;
            }
        }
        return jump;
    }
}