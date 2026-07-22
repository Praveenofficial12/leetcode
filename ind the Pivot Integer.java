class Solution {
    public int pivotInteger(int n) {
        int ans=(n*n+n)/2;
        int res=(int)Math.sqrt(ans);
        if(res*res==ans) return res;
        return -1;
    }
}
