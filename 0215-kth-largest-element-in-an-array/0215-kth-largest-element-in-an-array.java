class Solution {
    public int findKthLargest(int[] n, int k) {
        int l=n.length;
        Arrays.sort(n);
        return n[l-k];
    }
}