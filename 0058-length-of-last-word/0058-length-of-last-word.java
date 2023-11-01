// class Solution {
//     public int lengthOfLastWord(String s)
//     {
//         int j=0;
//         int l=s.length();
//         int i=l-1;
       
//         while(i>=0 && s.charAt(i)==' ')
//         {
//             i--;
//         }
//         while(i>00 && s.charAt(i)!=' ')
//         {
//             j++;
//             i--;
//         }
       

//         return j;
        
//     }
// }

class Solution {
    public int lengthOfLastWord(String s) {
        int j = 0;
        int l = s.length();

        // Start iterating from the end of the string
        int i = l - 1;

        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count the characters in the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            j++;
            i--;
        }

        return j;
    }
}
