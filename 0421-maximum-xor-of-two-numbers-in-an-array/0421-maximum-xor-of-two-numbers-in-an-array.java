class Solution {
    public int findMaximumXOR(int[] nums) {
        int result = 0;
        int mask = 0;

        for(int i = 31; i >= 0; i--) {
            mask = mask | (1 << i);
            int candidateResult = result | (1 << i);
            HashSet<Integer> set = new HashSet<>();
            for(int num : nums) {
                set.add(num & mask);
            }
            for(int prefix : set) {
                if(set.contains(candidateResult ^ prefix)) {
                    result = candidateResult;
                    break;
                }
            }
        }
        return result;
    }
}
