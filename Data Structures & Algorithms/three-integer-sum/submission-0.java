
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ll = new ArrayList<>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            HashMap<Integer, Integer> mp = new HashMap<>();
            for (int j = i + 1; j < nums.length; j++) {
                int complement = -(nums[i] + nums[j]);
                if (mp.containsKey(complement)) {
                    ll.add(Arrays.asList(nums[i], nums[j], complement));
                    while (j + 1 < nums.length && nums[j] == nums[j + 1]) j++;
                }
                mp.put(nums[j], j);
            }
        }

        return ll;
    }
}