class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count=new int[1001];
        for(int a:arr1){
            count[a]++;
        }
        int z=0;
        for(int i=0;i<arr2.length;i++){
            while(count[arr2[i]]>0){
                arr1[z++]=arr2[i];
                count[arr2[i]]--;
            }
        }
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr1[z++]=i;
                count[i]--;
            }
        }
        return arr1;
    }
}