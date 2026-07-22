class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l=0;
        int r=0;
        int u=0;
        for(char c:moves.toCharArray()){
            if(c=='L') l++;
            else if(c=='R') r++;
            else u++;
        }
        return Math.abs(l-r)+u;
    }
}
