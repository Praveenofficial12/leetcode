class Solution {
    public int maxProduct(int n) {
       int pro=0;
       int max=0;
       while(n>0){
        int digit=n%10;
        if(digit>pro) {
            max=pro;
            pro=digit;
        }
        else if(digit>max) max=digit;
        n=n/10;
       }
       return pro*max;
    }
}
