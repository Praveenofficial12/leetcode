class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       List<Integer> list=new ArrayList<>();
       for(int i:nums1){
        for(int j:nums2){
            if(i==j&& !list.contains(i)){
                list.add(i);
                break;
            }
        }
       }
       int ans[]=new int[list.size()];
       for(int i=0;i<ans.length;i++){
        ans[i]=list.get(i);
       }
       return ans;
    }
}
