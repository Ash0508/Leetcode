class Solution {
    public int findMaxConsecutiveOnes(int[] a) {
        int l=a.length;
        int s=0;
        int max=0;
        for(int i=0;i<l;i++)
        {
            if(a[i]==1) s++;
            if(a[i]==0)
            {
               s=0;
            }
            if(max<s) max=s;
          
        }
        return max;
        
    }
}

 // int count=0,max=0;
 //        for(int i=0;i<nums.length;i++){
 //            if(nums[i]==1){
 //                count++;
 //            }
 //            if(max<count){
 //                max=count;
 //            }
 //            if(nums[i]==0){
 //                count=0;
 //            }
 //        }
 //        return max;
 //    }