class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : nums)
            map.put(x, map.getOrDefault(x, 0) + 1);

        int ans = 0;

        for (int f : map.values()) {
            if (f == 1) return -1;

            ans += (f + 2) / 3;
        }

        return ans;
    }
}