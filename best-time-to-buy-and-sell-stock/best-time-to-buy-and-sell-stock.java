class Solution {
    public int maxProfit(int[] p) {
        int pr=0,max=0,min=p[0];
        for(int i=0;i<p.length;i++){
            if(p[i]<min)min=p[i];
            if(max<p[i]-min) max=p[i]-min;
        }
        return max;
    }
}