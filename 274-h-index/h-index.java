import java.util.*;
class Solution {
    public int hIndex(int[] c) {
        Arrays.sort(c);
        for(int i=0;i<c.length;i++){
            int h=c.length-i;
            if(c[i]>=h) return h; 
        }
        return 0;
    }
}