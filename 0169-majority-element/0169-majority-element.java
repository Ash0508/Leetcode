class Solution {
    public int majorityElement(int[] a) {
       Arrays.sort(a);
        int n=a.length;
        return a[n/2];
    }
}