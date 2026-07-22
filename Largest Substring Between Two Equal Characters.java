class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        String [] s1=s.split("");
        for(int i=s1.length-1;i>0;i--){
            for(int j=0;j+i<s1.length;j++){
                if(s1[j].equals(s1[j+i])) return i-1;
            }
        }
        return -1;
    }
}
