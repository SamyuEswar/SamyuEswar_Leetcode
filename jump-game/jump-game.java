class Solution {
    public boolean canJump(int[] nums) {
        int c=0,m=0;
        for(int i=0;i<nums.length;i++){
            if(i>m) return false;
            c=i+nums[i];
            m=Math.max(m,c);
        }
        return true;
    }
}