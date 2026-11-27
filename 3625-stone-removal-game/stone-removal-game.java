class Solution {
    public boolean canAliceWin(int n) {
        int r=10;
        boolean a=true;
        while(!(n<r) && !(r==0)){
            n=n-r;
            r--;
            a=!a;
        }
        return !a;
    }
}