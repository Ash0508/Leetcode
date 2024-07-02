class Solution {
    public int[] intersect(int[] n1, int[] n2) {

        int l1=n1.length;
        int l2=n2.length;
        int i=0,j=0,k=0;
        Arrays.sort(n1);
        Arrays.sort(n2);
        while(i<l1 && j<l2)
        {
            if(n1[i]<n2[j]) i++;
            else if(n1[i]>n2[j]) j++;
            else{
                n1[k++]=n1[i++];
                j++;
            }
        }

        return Arrays.copyOfRange(n1,0,k);
        
    }
}