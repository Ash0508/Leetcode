import java.util.*;
class Solution {
    public void nextPermutation(int[] a) {
        int n=a.length;
        int index=-1;
        for(int i=n-2;i>=0;i--)
        {
            if(a[i]<a[i+1])
            {
                index=i;
                break;
            }
        }
        if(index==-1)
        {
              reverse(a, 0, n - 1);
            return;
        }

        for(int i=n-1;i>index;i--)
        {
            if(a[i]>a[index])
            {
                int t=a[i];
                a[i]=a[index];
                a[index]=t;
                break;
            }
        }
        reverse(a, index + 1, n - 1);       
    }
      public void reverse(int[] a, int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
}




//  public void nextPermutation(int[] a) {
//         int n = a.length;
//         int index = -1;

//         // Step 1: Find the first decreasing element from the end
//         for (int i = n - 2; i >= 0; i--) {
//             if (a[i] < a[i + 1]) {
//                 index = i;
//                 break;
//             }
//         }

//         // If no such element is found, reverse the array
//         if (index == -1) {
//             reverse(a, 0, n - 1);
//             return;
//         }

//         // Step 2: Find the element just larger than a[index] from the end
//         for (int i = n - 1; i > index; i--) {
//             if (a[i] > a[index]) {
//                 // Swap a[index] and a[i]
//                 int t = a[i];
//                 a[i] = a[index];
//                 a[index] = t;
//                 break;
//             }
//         }

//         // Step 3: Reverse the elements after the index
//         reverse(a, index + 1, n - 1);
//     }

//     // Helper function to reverse elements in the array from start to end indices
//     private void reverse(int[] a, int start, int end) {
//         while (start < end) {
//             int temp = a[start];
//             a[start] = a[end];
//             a[end] = temp;
//             start++;
//             end--;
//         }
//     }
