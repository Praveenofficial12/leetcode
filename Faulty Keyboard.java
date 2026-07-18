class Solution {
    public String finalString(String s) {
       StringBuilder a=new StringBuilder();
       for(char c:s.toCharArray()){
        if(c=='i') a.reverse();
        else a.append(c);
       } 
       return a.toString();
    }
}
