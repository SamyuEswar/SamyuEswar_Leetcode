class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] a=new int[2];
        Arrays.fill(a,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if(a[0]==-1){
                    a[0]=i;
                }
                a[1]=i;
            }
        }
        return a;
    }
}