class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int idx= 0;
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> res= new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        helper(nums, curr, res, used);
        return res;
    }
    public void helper(int[] nums, List<Integer> curr,List<List<Integer>> res, boolean[] used) {

        if (curr.size() == nums.length) {
            res.add(new ArrayList<>(curr));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            curr.add(nums[i]);
            helper(nums, curr, res, used);
            curr.remove(curr.size() - 1);
            used[i] = false;
        }
    }
}
