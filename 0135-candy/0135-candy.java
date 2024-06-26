class Solution {
    public int candy(int[] r) {
        int n=r.length;
        int []c=new int[n];
        Arrays.fill(c,1);

        for(int i=1;i<n;i++)
        {
            if(r[i]>r[i-1])
            c[i]=c[i-1]+1;
        }

        for(int i=n-2;i>=0;i--)
        {
            if(r[i]>r[i+1]) c[i]=Math.max(c[i],c[i+1]+1);
        }

        int totcan=0;
        for(int candy:c){
            totcan+=candy;
        }
        return totcan;
    }
}

