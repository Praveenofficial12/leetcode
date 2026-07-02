class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        f(nums, 0);
        return ans;
    }

    void f(int[] a, int i) {
        if (i == a.length) {
            List<Integer> t = new ArrayList<>();
            for (int x : a) t.add(x);
            ans.add(t);
            return;
        }
        for (int j = i; j < a.length; j++) {
            int x = a[i];
            a[i] = a[j];
            a[j] = x;
            f(a, i + 1);
            x = a[i];
            a[i] = a[j];
            a[j] = x;
        }
    }
}
