class Solution {
    public String digitSum(String s, int k) {
        while(s.length()>k){
            StringBuilder next = new StringBuilder();
            for(int i=0;i<s.length();i+=k){
                int sum=0;
             for (char c : s.substring(i, Math.min(i + k, s.length())).toCharArray()) {
                sum+=c-'0';
            }
            next.append(sum);
            }
            s=next.toString();
        }
        return s;
    }
}
