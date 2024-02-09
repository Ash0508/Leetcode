// class Solution {
//     public int compress(char[] chars) {
//      String str=new String(chars);
     
//         int n=str.length();
//         int cnt=1;
//         int singh=0;
//         String ans=""+str.charAt(0);
        
//         for(int i=1;i<n;i++)
//         {
//             char curr=str.charAt(i);
//             char prev=str.charAt(i-1);
//             if(curr==prev) cnt++;
//             else{
//                 if(cnt>1)
//                 {
//                     ans+=cnt;
//                     cnt=1;
//                     ans+=curr;
//                 }
//             }
    
//         }
//                 if(cnt>1)
//               {
//                   ans+=cnt;
//               }
//         chars = ans.toCharArray();
//          return chars.length;
//     }
// }


class Solution {
    public int compress(char[] chars) { 
 int indexAns = 0, index = 0;
        while(index < chars.length){
            char currentChar = chars[index];
            int count = 0;
            while(index < chars.length && chars[index] == currentChar){
                index++;
                count++;
            }
            chars[indexAns++] = currentChar;
            if(count != 1)
                for(char c : Integer.toString(count).toCharArray()) 
                    chars[indexAns++] = c;
        }
        return indexAns;
    }
}