class Solution {
    public long sumAndMultiply(int n) {
        int x=0,s=0,p=1;
        while(n>0){
            int d=n%10;
            if(d>0){
                x+=d*p; 
                p*=10;
                s+=d;
            }
            n/=10;
        }
        return 1L*x*s;
    }
}
