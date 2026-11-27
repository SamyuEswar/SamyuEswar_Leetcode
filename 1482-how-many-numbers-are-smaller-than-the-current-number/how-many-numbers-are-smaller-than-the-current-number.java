class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] a=new int[101];
        for(int i:nums){
            a[i]++;
        }
        for(int i=1;i<101;i++){
            a[i]+=a[i-1];
        }
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) res[i]=0;
            else res[i]=a[nums[i]-1];
        }
        return res;
    }
}