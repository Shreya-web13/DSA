class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> resultSet = new HashSet<>();
        Arrays.sort(nums); // helps with duplicates

        for (int i = 0; i < nums.length - 2; i++) {
            int target = -nums[i];
            Map<Integer, Integer> map = new HashMap<>();

            for (int j = i + 1; j < nums.length; j++) {
                int complement = target - nums[j];

                if (map.containsKey(complement)) {
                    // found a triplet
                    resultSet.add(Arrays.asList(nums[i], complement, nums[j]));
                }
                map.put(nums[j], j);
            }
        }

        return new ArrayList<>(resultSet);
    }
}
