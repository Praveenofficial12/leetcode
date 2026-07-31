class Solution {
    public String removeStars(String s) {
        char [] arr=s.toCharArray();
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='*') j--;
            else {
                arr[j]=arr[i]; 
                j++;}
        } 
        return new String(arr,0,j);
    }
}
