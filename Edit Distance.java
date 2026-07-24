class Solution {
    public int minDistance(String a, String b) {
        int m=a.length();
        int n=b.length();
        int arr[][]=new int [m+1][n+1];
        for(int i=0;i<=m;i++){
            arr[i][0]=i;
            for(int j=0;j<=n;j++){
                arr[0][j]=j;
            }
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                arr[i][j]=a.charAt(i-1)==b.charAt(j-1)?arr[i-1][j-1]:1+Math.min(arr[i-1][j-1],Math.min(arr[i-1][j],arr[i][j-1]));
            }
        }
        return arr[m][n];
    }
}
