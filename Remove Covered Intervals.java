class Solution {
    public int removeCoveredIntervals(int[][] a) {
        int ans = a.length;
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a.length; j++)
                if (i != j && a[j][0] <= a[i][0] && a[j][1] >= a[i][1]) {
                    ans--;
                    break;
                }
        return ans;
    }
}
