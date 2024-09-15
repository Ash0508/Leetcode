// class Solution {
//     public int[] plusOne(int[] d) {
//         int n=d.length;
//         int c=1;
//         for(int i=n-1;i>=0;i--)
//         {
//             int s=d[i]+c;
//             d[i]=s%10;
//             c=s/10;
//         }
//         if(c==0) return d;
//         else{
//             int r[]=new int[n+1];
//             r[0]=c;
//             System.arraycopy(d,0,r,1,n);
//             return r;
//         }
       
//     }
// }


public class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Start from the end of the array
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, increment it and return the result
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If the current digit is 9, set it to 0 and carry over 1
            digits[i] = 0;
        }
        
        // If we have carried over past the most significant digit
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}
