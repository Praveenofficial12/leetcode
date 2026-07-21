class Solution {
    public String reverseVowels(String s) {
        char [] c=s.toCharArray();
        String v="aeiouAEIOU";
        for(int i=0,j=c.length-1;i<j;){
            while(i<j && v.indexOf(c[i])==-1) i++;
            while(i<j && v.indexOf(c[j])==-1) j--;
            char temp=c[j];
            c[j]=c[i];
            c[i]=temp;
            i++;
            j--;
        }
        return new String(c);
    }
}
