class Solution {
    public void sortColors(int[] a) {
        int n=a.length;
        int l=0,h=n-1,m=0;
        while(m<=h)
        {
            if(a[m]==0)
            {
                int t=a[l];
                a[l]=a[m];
                a[m]=t;
                m++;
                l++;
            }
            else if(a[m]==1) 
            {
                m++;
            }
            else{
                int t=a[m];
                a[m]=a[h];
                a[h]=t;
                h--;
            }
        }
    }
}